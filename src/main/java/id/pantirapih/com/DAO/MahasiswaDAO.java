package id.pantirapih.com.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import id.pantirapih.com.Model.Mahasiswa;

@Transactional(noRollbackFor = Exception.class)
@Repository
public class MahasiswaDAO implements IMahasiswaDAO{
	@PersistenceContext
	private EntityManager entityManager;
	
	public void tambahMahasiswa(Mahasiswa m) {
		entityManager.getEntityManagerFactory().getCache().evictAll();
		m.setDeleted(0);
		entityManager.merge(m);				
	}

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		entityManager.getEntityManagerFactory().getCache().evictAll();
		String hql = "FROM Mahasiswa WHERE deleted = 0";
		return (List<Mahasiswa>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void deleteMahasiswa(Long m) {
		entityManager.getEntityManagerFactory().getCache().evictAll();
		Mahasiswa mTamp = entityManager.find(Mahasiswa.class, m);
		mTamp.setDeleted(1);
		entityManager.merge(mTamp);	
		
	}
	
	
	
	
	
	

}

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
	
	public void tambahMahasiswa(final Mahasiswa m) {
		entityManager.getEntityManagerFactory().getCache().evictAll();
		m.setDeleted(0);
		entityManager.merge(m);				
	}

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		entityManager.getEntityManagerFactory().getCache().evictAll();
		final String hql = "FROM Mahasiswa WHERE deleted = 0";
		return (List<Mahasiswa>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public void deleteMahasiswa(final Long m) {
		entityManager.getEntityManagerFactory().getCache().evictAll();
		final Mahasiswa mTamp = entityManager.find(Mahasiswa.class, m);
		mTamp.setDeleted(1);
		entityManager.merge(mTamp);	
		
	}

	@Override
	public Mahasiswa getMahasiswaByNama(final String nama) {
		entityManager.getEntityManagerFactory().getCache().evictAll();
		final String hql = "SELECT new Mahasiswa(idmhs, namaMhs, nim, jurusan, tanggalLahir) FROM Mahasiswa mhs WHERE mhs.namaMhs='" + nama + "' AND mhs.deleted=0";
		return (Mahasiswa) entityManager.createQuery(hql).getSingleResult();
	}
	
	
	
	
	
	

}

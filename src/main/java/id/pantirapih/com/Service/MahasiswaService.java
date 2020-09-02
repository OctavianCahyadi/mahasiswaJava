package id.pantirapih.com.Service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import id.pantirapih.com.DAO.IMahasiswaDAO;
import id.pantirapih.com.Exception.MahasiswaException;
import id.pantirapih.com.Model.Mahasiswa;
@Service
@PersistenceContext

public class MahasiswaService implements IMahasiswaService{
	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private IMahasiswaDAO iMhsDAO;
	
	public void tambahMahasiswa(Mahasiswa m) {
		iMhsDAO.tambahMahasiswa(m);		
	}

	@Override
	public List<Mahasiswa> getAllMahasiswa() {
		List<Mahasiswa> tamp = new ArrayList<>();
		try {
			tamp = iMhsDAO.getAllMahasiswa();
		} catch (Exception e) {
			throw new MahasiswaException(e.getMessage(), "Data Tidak Ditemukan", StatusCode.QUERYSELECT.getCode());
		}

		if (tamp.size() == 0) {
			throw new MahasiswaException("", "Data Tidak Ditemukan", StatusCode.DATANOTFOUND.getCode());
		}

		return tamp;
	}

	@Override
	public void deleteMahasiswa(Mahasiswa m) {
		iMhsDAO.deleteMahasiswa(m.getIdmhs());
		
	}

}

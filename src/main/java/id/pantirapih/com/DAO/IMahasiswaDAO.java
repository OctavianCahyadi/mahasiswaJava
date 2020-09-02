package id.pantirapih.com.DAO;

import java.util.List;

import id.pantirapih.com.Model.Mahasiswa;

public interface IMahasiswaDAO {

	void tambahMahasiswa(Mahasiswa m);

	List<Mahasiswa> getAllMahasiswa();

	void deleteMahasiswa(Long long1);

	Mahasiswa getMahasiswaByNama(String nama);

}

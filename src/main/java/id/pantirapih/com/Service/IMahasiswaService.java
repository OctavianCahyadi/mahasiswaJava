package id.pantirapih.com.Service;

import java.util.List;

import id.pantirapih.com.Model.Mahasiswa;

public interface IMahasiswaService {

	void tambahMahasiswa(Mahasiswa m);

	List<Mahasiswa> getAllMahasiswa();

	void deleteMahasiswa(Mahasiswa m);

	Mahasiswa getMahasiswaByNama(String nama);

}

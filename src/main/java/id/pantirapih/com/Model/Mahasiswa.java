package id.pantirapih.com.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "mahasiswa")
public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Long idmhs;
	@Column(name = "nama")
	private String namaMhs;
	@Column (name = "nim")
	private String nim;
	@Column (name = "tanggallahir")
	private String tanggalLahir;
	@Column (name = "jurusan")
	private String jurusan;
	@Column (name = "deleted")
	private Integer deleted;
	
	
	public Integer getDeleted() {
		return deleted;
	}

	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}

	public Mahasiswa() {
		super();
	}
	
	public Mahasiswa(Long idmhs, String namaMhs, String nim, String jurusan, String tanggalLahir) {
		super();
		this.idmhs = idmhs;
		this.namaMhs = namaMhs;
		this.nim = nim;
		this.jurusan = jurusan;
		this.tanggalLahir = tanggalLahir;
	}
	public Long getIdmhs() {
		return idmhs;
	}
	public void setIdmhs(Long idmhs) {
		this.idmhs = idmhs;
	}
	public String getNamaMhs() {
		return namaMhs;
	}
	public void setNamaMhs(String namaMhs) {
		this.namaMhs = namaMhs;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
	
}

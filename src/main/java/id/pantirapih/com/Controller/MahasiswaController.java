package id.pantirapih.com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import id.pantirapih.com.Model.Mahasiswa;
import id.pantirapih.com.Service.IMahasiswaService;


@RestController
@RequestMapping("/Mahasiswa")
public class MahasiswaController {
	
	@Autowired
	IMahasiswaService mhs;
	
	@RequestMapping(value = "/tambahMahasiswa", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public synchronized ResponseEntity<Mahasiswa> tambahMahasiswa(@RequestBody Mahasiswa m) {
		mhs.tambahMahasiswa(m);
		return new ResponseEntity<Mahasiswa>(m, HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllMahasiswa")
	public List<Mahasiswa> getAllMahasiswa() {
		List<Mahasiswa> mahasiswa = mhs.getAllMahasiswa();
		return mahasiswa;
	}	
	
	@RequestMapping(value = "/deleteMahasiswa", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public synchronized ResponseEntity<Mahasiswa> deleteMahasiswa(@RequestBody Mahasiswa m) {
		mhs.deleteMahasiswa(m);
		return new ResponseEntity<Mahasiswa>(m, HttpStatus.CREATED);
	}
	
}

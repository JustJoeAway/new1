/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Joe
 */
public class Mahasiswa {
        String nim;
	String kelas;
	String nama;
	String falkultas;
	int mmr;
	int index_kebahagiaan;
        
        public Mahasiswa(String nama, String kelas, String nim){
            this.nama=nama;
            this.kelas=kelas;
            this.nim=nim;
        }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    public String getFalkultas() {
        return falkultas;
    }

    public int getMmr() {
        return mmr;
    }

    public int getIndex_kebahagiaan() {
        return index_kebahagiaan;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setFalkultas(String falkultas) {
        this.falkultas = falkultas;
    }

    public void setMmr(int mmr) {
        this.mmr = mmr;
    }

    public void setIndex_kebahagiaan(int index_kebahagiaan) {
        this.index_kebahagiaan = index_kebahagiaan;
    }
    
        
}


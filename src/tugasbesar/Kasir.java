/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasbesar;

import java.util.ArrayList;

/**
 *
 * @author Nikho Sagala
 */
public class Kasir {

    private String idKasir;
    private String namaKasir;

    /**
     * Constructor Kasir by 1103130063
     */
    public Kasir() {
    }

    /**
     * Constructor Kasir by 1103130063
     *
     * @param idKasir mengisi id kasir pada kasir, tipe: String
     * @param namaKasir mengisi nama kasir pada kasir, tipe: String
     */
    public Kasir(String idKasir, String namaKasir) {
        this.idKasir = idKasir;
        this.namaKasir = namaKasir;
    }

    /**
     * Method untuk mendapatkan id kasir by 1103130063
     *
     * @return idKasir
     */
    public String getIdKasir() {
        return idKasir;
    }

    /**
     * Method untuk mengeset id kasir by 1103130063
     *
     * @param idKasir id kasir yang akan diset, tipe: String
     */
    public void setIdKasir(String idKasir) {
        this.idKasir = idKasir;
    }

    /**
     * Method untuk mendapatkan nama kasir by 1103130063
     *
     * @return namaKasir
     */
    public String getNamaKasir() {
        return namaKasir;
    }

    /**
     * Method untuk mengeset nama kasir by 1103130063
     *
     * @param namaKasir nama kasir yang akan diset, tipe: String
     */
    public void setNamaKasir(String namaKasir) {
        this.namaKasir = namaKasir;
    }
}

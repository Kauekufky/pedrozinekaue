
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Treinamenro {
    private int identificadorescla;
    private String nome;
    private String descriçao;
    private String cargahorario;
    private Date dataRealizaçao;

    public int getIdentificadorescla() {
        return identificadorescla;
    }

    public void setIdentificadorescla(int identificadorescla) {
        this.identificadorescla = identificadorescla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public String getCargahorario() {
        return cargahorario;
    }

    public void setCargahorario(String cargahorario) {
        this.cargahorario = cargahorario;
    }

    public Date getDataRealizaçao() {
        return dataRealizaçao;
    }

    public void setDataRealizaçao(Date dataRealizaçao) {
        this.dataRealizaçao = dataRealizaçao;
    }
}


import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class EscaladeServiço {
    private int identificadorescala;

    public int getIdentificadorescala() {
        return identificadorescala;
    }

    public void setIdentificadorescala(int identificadorescala) {
        this.identificadorescala = identificadorescala;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getBombeiro() {
        return Bombeiro;
    }

    public void setBombeiro(String Bombeiro) {
        this.Bombeiro = Bombeiro;
    }
    private Date data;
    private String turno;
    private String Bombeiro;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class StatusCorrencia {
    private boolean iniciada;
    private boolean finalizada;
    private boolean andamento;
    private boolean Cancelada;

    public boolean isIniciada() {
        return iniciada;
    }

    public void setIniciada(boolean iniciada) {
        this.iniciada = iniciada;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    public boolean isAndamento() {
        return andamento;
    }

    public void setAndamento(boolean andamento) {
        this.andamento = andamento;
    }

    public boolean isCancelada() {
        return Cancelada;
    }

    public void setCancelada(boolean Cancelada) {
        this.Cancelada = Cancelada;
    }
}

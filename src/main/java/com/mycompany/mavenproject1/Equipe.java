/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Equipe {
  private int  identificadorequipe;
  private String nome;
  private String tipo;
  private boolean Status;

    public int getIdentificadorequipe() {
        return identificadorequipe;
    }

    public void setIdentificadorequipe(int identificadorequipe) {
        this.identificadorequipe = identificadorequipe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean Status) {
        this.Status = Status;
    }
}

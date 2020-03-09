package us.com.alberto.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Partido {

    private String local;
    private String visitante;
    private int resultadoLocal;
    private int resultadoVisitante;
    private Division division;
    private String resultado;
    private Date date;

    public Partido(String local, String visitante, int resultadoLocal, int resultadoVisitante, Division division,
                   String resultado, Date date) {
        this.local = local;
        this.visitante = visitante;
        this.resultadoLocal = resultadoLocal;
        this.resultadoVisitante = resultadoVisitante;
        this.division = division;
        this.resultado = resultado;
        this.date = date;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public int getResultadoLocal() {
        return resultadoLocal;
    }

    public void setResultadoLocal(int resultadoLocal) {
        this.resultadoLocal = resultadoLocal;
    }

    public int getResultadoVisitante() {
        return resultadoVisitante;
    }

    public void setResultadoVisitante(int resultadoVisitante) {
        this.resultadoVisitante = resultadoVisitante;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * Devuelve la fecha convertida en string para imprimir la propiedad en la tabla
     *
     * @return
     */
    public String getFechaString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaS = sdf.format(date);
        return fechaS;
    }

    public String calcularResultado() {
        String local = String.valueOf(resultadoLocal);
        String visitante = String.valueOf(resultadoVisitante);
        resultado = local + "-" + visitante;
        return resultado;
    }

    @Override
    public String toString() {
        return "Partido{" +
                "local='" + local + '\'' +
                ", visitante='" + visitante + '\'' +
                ", resultadoLocal=" + resultadoLocal +
                ", resultadoVisitante=" + resultadoVisitante +
                ", division=" + division +
                ", resultado='" + resultado + '\'' +
                ", date=" + date +
                '}';
    }
}

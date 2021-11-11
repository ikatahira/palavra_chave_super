public class Aluno extends Pessoa {
    
    private String cursos;
    private double nota1;
    private double nota2;
    
    public double getNota2() {
        return nota2;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public String getCursos() {
        return cursos;
    }
    public void setCursos(String cursos) {
        this.cursos = cursos;
    }
    public double getNota1() {
        return nota1;
    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }
    public double calcularMedia(){
        double media;
        media=(this.nota1+this.nota2)/2.0;
        return media;
    }

    public double verificarAprovado(){
        if(calcularMedia()>6){
            System.out.println("Aprovado");
            return calcularMedia();
        }else{
            System.out.println("Reprovado");
            return calcularMedia();
        }
     
    }

}

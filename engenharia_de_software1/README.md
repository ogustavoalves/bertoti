<h3>O que é engenharia de software</h3>
<p>We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play.   On a software engineering project, engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes, often based on imprecise estimates of time and growth.
 r: As preocupações de um engenheiro de software são distintas das de um programador. Questões como o efeito da passagem do tempo sobre o software, escala e eficiência do programa e da organização e até tomar decisões importantes baseando-se em dados muitas vezes imprecisos. Tais pontos demonstram que engenheiros de software lidam com muito mais que o desenvolvimento de produtos.

Within Google, we sometimes say, “Software engineering is programming integrated over time.” Programming  is certainly a significant part of software engineering: after all, programming is how you generate new software in the first place. If you accept this distinction, it also becomes clear that we might need to delineate between programming tasks (development) and software engineering tasks (development, modification, maintenance). The addition of time adds an important new dimension to programming. Cubes aren’t squares, distance isn’t velocity. Software engineering isn’t programming.
 r: engenharia de software é programação envolvendo tempo, escala e trade-off;</p>

<h3>O que são requisitos</h3>
<p>O que são requisitos: requisitos são necessidade do cliente que irão ditar como o engenheiro de software constrói o software. 
Eles são separados em duas categorias: <br>
1. Requisitos funcionais, que são os requisitos que o programa TEM que ter. por exemplo, um app de mensagens tem que ser capaz de enviar mensagens para outras pessoas<br>
2. Requisitos não-funcionais se referem a qualidades do software, por exemplo, o app de mensagem tem que enviar as mensagens rapidamente.</p>

<h4>Exemplos de requisitos e seus trade-offs</h4>
<ul>
 <li>Segurança:</li><p> Tempo para implementar, auditoria, revisão constante de ferramenteas e atualizazções / Menos problemas relacionados a vazamento de dados e coisas do gênero/</p>
 <li>Portabilidade:</li><p> Preocupação com implementação em vários dispositivos diferentes, revisão constante / Alcance de maior n° de usuários/</p>
 </ul>

<h3>Diagrama de Classes</h3>
<div align="center">
 <img src="imgs/diagrama2.JPG" alt="diagrama de classes" width="400px">
</div>
<br>

```java
  
  //classe 1
  import java.util.ArrayList;

public class Sala {
    private String turma;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private Professor professor;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();


    public Sala(String turma) {
        this.turma = turma;

    }
    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setListaAlunos(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setDisciplinas(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void exibeListaAlunos() {
        for (int i = 0; i < alunos.size(); i++) {
            System.out.println(alunos.get(i).getNomeAluno());
        }
    }

    public void exibeDisciplinas() {
        for (int i = 0; i < disciplinas.size(); i++) {
            System.out.println(disciplinas.get(i).getNomeDisciplina());
        }
    }

}

   
   //classe 2
public class Professor {
    private String nomeProfessor;
    private String disciplinaLecionada;

    public Professor(String nomeProfessor, String disciplinaLecionada) {
        this.nomeProfessor = nomeProfessor;
        this.disciplinaLecionada = disciplinaLecionada;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public void setDisciplinaLecionada(String disciplinaLecionada) {
        this.disciplinaLecionada = disciplinaLecionada;
    }

    public void Imprimir() {
        System.out.println("Nome: " + nomeProfessor);
        System.out.println("Disciplina: " + disciplinaLecionada);
    }
    
}



  //classe 3
public class Disciplina {
    private String nomeDisciplina;
    private int cargaHoraria;

    public Disciplina(String nomeDisciplina, int cargaHoraria) {
        this.nomeDisciplina = nomeDisciplina;
        this.cargaHoraria = cargaHoraria;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void Imprimir() {
        System.out.println("Nome da Disciplina: " + nomeDisciplina);
        System.out.println("Carga Horária: " + cargaHoraria);
    }

}


  //classe 4
public class Aluno {
    private String turma;
    private String nomeAluno;
    private int RA;

    public Aluno(String turma, String nomeAluno, int RA) {
        this.turma = turma;
        this.nomeAluno = nomeAluno;
        this.RA = RA;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }

    public String getNomeAluno() {
         return nomeAluno;
    }

    public void Imprimir() {
        System.out.println("Turma: " +  turma);
        System.out.println("Nome do Aluno: " +  nomeAluno);
        System.out.println("RA: " +  RA);
    }
    
}


  

```

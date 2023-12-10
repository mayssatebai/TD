public class Etudiant {

    private int id;
    private String nom;
    private String prenom;

    public Etudiant(){

    }
    public Etudiant(int id , String nom, String prenom){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public boolean Equals(Object obj){
        if (obj==this) return true;
        if(obj==null) return false;
        if(this.getClass()!=obj.getClass()) return false;
        Etudiant etudiant=(Etudiant) obj;
        if(etudiant.id==this.id) return true; return false;
    }
    public String toString(){
        return "id :" +id+
                " nom :"+nom+
                " prenom:"+prenom ;
    }
}

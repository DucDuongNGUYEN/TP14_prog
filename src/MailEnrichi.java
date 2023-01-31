public class MailEnrichi extends Mail {
    private Fichier attachement;

    MailEnrichi(String auteur, String destinataire, String sujet, String contenu) {
        super(auteur, destinataire, sujet, contenu);
    }

    void attache(Fichier attachement) {
        this.attachement = attachement;
    }

    Fichier recupere() {
        return this.attachement;
    }

    void affiche() {
        super.affiche();
        if (this.attachement != null) System.out.println("Att : " + this.attachement.getNom());
    }
//Question 1.2 :
    /*cette classe a respecté le principe de Liskov. On peut substituer par une instance d'une classe(Fichier) en conservant un comportement compatible avec la super classe(Mail)qui a la sous-classe(MailEnrichi).
     (la méthode contient dans la classe(Fichier) est pareil de celle dans la super classe(Mail)(getContenu()).*/
}

public class FichierMail extends Fichier {
    FichierMail(Object contenu, String nom) {
        super(contenu, nom);
    }

    @Override
    void execute() {
        ((Mail) getContenu()).affiche();
    }
}

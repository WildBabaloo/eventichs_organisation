package gti.g55.eventichs_organisation.Domaine.Interacteurs

import android.util.Log
import gti.g55.eventichs_organisation.Domaine.Entités.Évènement

class InteracteurAcquisitionÉvènement(var source: SourceÉvènement) {
    private var _ListeÉvènement: ArrayList<Évènement> = ArrayList()

    @get:Throws(ÉvènementException::class)
    val évènement: ArrayList<Évènement>
        get() = _ListeÉvènement ?: obtenirNouvelleListeÉvènement()


    @Throws(ÉvènementException::class)
    fun obtenirNouvelleListeÉvènement(): ArrayList<Évènement> {
        var nouvelleListeÉvènement = source.récupérerListeÉvènements()
        //while (nouvelleListeÉvènement == _ListeÉvènement){
            //nouvelleListeÉvènement = source.récupérerListeÉvènements()
            //break
        //}
        _ListeÉvènement = nouvelleListeÉvènement as ArrayList<Évènement>
        return _ListeÉvènement
    }

    @Throws(ÉvènementException::class)
    fun creerÉvènement(evenement: Évènement){
        Log.e("Size before is:", _ListeÉvènement.size.toString())

        source.ajouterÉvènement(evenement)
    }

    @Throws(ÉvènementException::class)
    fun modifierÉvènement(evenement: Évènement){
        source.modifierÉvénements(evenement)
    }

    @Throws(ÉvènementException::class)
    fun findEvenementById(id: Int): Évènement?{
        return source.findÉvènementById(id)
    }
}
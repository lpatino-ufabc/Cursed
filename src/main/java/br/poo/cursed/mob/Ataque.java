package br.poo.cursed.mob;

import br.poo.cursed.npc.Heroes;

public interface Ataque {
    
    public void ataqueSimples(Heroes heroi);
    
    public void ataqueRapido(Heroes heroi);
    
    public void ataqueForte(Heroes heroi);
    
    public void ataqueCarregado(Heroes heroi);
    
    public void ataqueCounter(Heroes heroi);
}

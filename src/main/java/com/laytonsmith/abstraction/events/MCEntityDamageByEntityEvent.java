package com.laytonsmith.abstraction.events;

import com.laytonsmith.abstraction.MCDamageCause;
import com.laytonsmith.abstraction.MCEntity;
import com.laytonsmith.core.events.BindableEvent;

/**
 *
 * @author EntityReborn
 */
public interface MCEntityDamageByEntityEvent extends BindableEvent {

    public MCDamageCause getCause();

    public MCEntity getDamagee();

    public MCEntity getDamager();

    public int getDamage();

    public void setDamage(int damage);
}
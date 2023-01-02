package me.neoblade298.neosapiaddons;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AddShieldsEvent extends Event {
    private static final HandlerList handlers = new HandlerList();
    private Player caster, target;
    private double amt, decayDelay, decayAmount, decayPeriod;
    private int decayRepetitions;
    
	public AddShieldsEvent(Player caster, Player target, double amt, double decayDelay, double decayAmount, double decayPeriod, int decayRepetitions) {
		this.caster = caster;
		this.target = target;
		this.amt = amt;
		this.decayDelay = decayDelay;
		this.decayAmount = decayAmount;
		this.decayPeriod = decayPeriod;
		this.decayRepetitions = decayRepetitions;
	}

	public Player getCaster() {
		return caster;
	}

	public Player getTarget() {
		return target;
	}

	public void setAmount(double amt) {
		this.amt = amt;
	}

	public void setDecayDelay(double decayDelay) {
		this.decayDelay = decayDelay;
	}

	public void setDecayAmount(double decayAmount) {
		this.decayAmount = decayAmount;
	}

	public void setDecayPeriod(double decayPeriod) {
		this.decayPeriod = decayPeriod;
	}

	public void setDecayRepetitions(int decayRepetitions) {
		this.decayRepetitions = decayRepetitions;
	}

	public double getAmount() {
		return amt;
	}
	
	public double getDecayDelay() {
		return decayDelay;
	}

	public double getDecayAmount() {
		return decayAmount;
	}

	public double getDecayPeriod() {
		return decayPeriod;
	}

	public int getDecayRepetitions() {
		return decayRepetitions;
	}

	@Override
	public HandlerList getHandlers() {
		return handlers;
	}

    public static HandlerList getHandlerList() {
        return handlers;
    }
}

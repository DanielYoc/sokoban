package model.data;

import java.io.Serializable;

/**
 * Floor GameElement
 */
public class Floor extends GameElement implements Serializable{

	private static final long serialVersionUID = 5L;
	
	@Override
	public String toString() {
		return "Floor , Position: " + getPosition().toString();
	}
}

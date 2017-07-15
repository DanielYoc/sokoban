package model.data;

import java.io.Serializable;

/**
 * Represent general game element
 */
public abstract class GameElement implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Position m_Location;

    public GameElement() {
        m_Location = new Position(0, 0);
    }
    
    public Position getPosition() {
        return m_Location;
    }

    public void setPosition(Position location) {
        this.m_Location = location;
    }
}

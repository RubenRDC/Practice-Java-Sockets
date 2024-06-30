package com.rubenrdc.practicesockets;

import com.rubenrdc.practicesockets.IGU.ClienteIGU;
import com.rubenrdc.practicesockets.IGU.ServidorIGU;

/**
 *
 * @author Ruben
 */
public class PracticeSockets {

    public static void main(String[] args) {
        ClienteIGU clIgu = new ClienteIGU();
        clIgu.setLocationRelativeTo(null);
        clIgu.setVisible(true);
        
        ServidorIGU serIgu = new ServidorIGU();
        serIgu.setLocationRelativeTo(null);
        serIgu.setVisible(true);
    }
}

package io.virtualapp.delegate;

import android.util.Log;

import com.lody.virtual.client.hook.delegate.PhoneInfoDelegate;


/**
 * Fake the Device ID.
 */
public class MyPhoneInfoDelegate implements PhoneInfoDelegate {

    @Override
    public String getDeviceId(String oldDeviceId, int userId) {
        String[] imeis = {
                "868918020049528",
                "868918020071225",
                "868918020010207",
                "868918020070185",
                "868918020070094",
                "868918020075192",
                "868918020070425",
                "868918020070318",
                "868918020072603",
                "868918020022392",
                "868918020022350",
                "868918020070037",
                "868918020072892",
                "868918020070276",
                "868918020024836",
                "868918020072074",
                "868918020074666",
                "868918020049908",
                "868918020071068"
        };

        return imeis[userId];
    }

    @Override
    public String getBluetoothAddress(String oldAddress, int userId) {
        return oldAddress;
    }

    @Override
    public String getMacAddress(String oldAddress, int userId) {
        return oldAddress;
    }
}

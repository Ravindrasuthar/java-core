package com.learning.core.day01session01;

import com.learning.core.day01session01.PS02.MedicineInfo;
import com.learning.core.day01session01.PS02.Ointment;
import com.learning.core.day01session01.PS02.Syrup;
import com.learning.core.day01session01.PS02.Tablet;

public class D01P02 {
    public static void main(String[] args) {

        MedicineInfo m1 = new Tablet();
        MedicineInfo m2 = new Syrup();
        MedicineInfo m3 = new Ointment();

        m1.displayLabel();
        m2.displayLabel();
        m3.displayLabel();

    }
}

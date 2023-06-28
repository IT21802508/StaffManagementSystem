package com.Userprofile;

import java.util.ArrayList;
import java.util.List;

public class StaffManager {
	
	
	
    private static StaffManager instance;
    private List<Staff> staffList;

    private StaffManager() {
        staffList = new ArrayList<>();
    }

    public static StaffManager getInstance() {
        if (instance == null) {
            instance = new StaffManager();
        }
        return instance;
    }

    public void addStaff(Staff staff) {
        staffList.add(staff);
    }

    public void removeStaff(Staff staff) {
        staffList.remove(staff);
    }

    public List<Staff> getAllStaff() {
        return staffList;
    }

    
}
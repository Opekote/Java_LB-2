package org.university;
import lombok.*;
import org.apache.commons.lang3.RandomStringUtils;

@Data
@NoArgsConstructor


public abstract class Item {
    protected String title;
    protected String uniqueID;
    protected boolean isBorrowed;

    abstract void borrowItem();
    abstract void returnItem();

    static String generateUniqueID(){
        return RandomStringUtils.randomNumeric(12);
    }

    public Item(String title, String uniqueID) {
        this.title = title;
        this.uniqueID = uniqueID;
    }
}
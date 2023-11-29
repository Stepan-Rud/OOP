package hw.museim;

import java.util.List;

public interface SearchExhibits {
    List<Exhibits> searchByExhibitName(String nameExhibit);
    List<Exhibits> searchByExhibitAge(Double age);
    List<Exhibits> searchByExhibitPeriod(String namePeriod);
}

package GameObjects;

import enums.AreaType;
/**
 * Created by onursonmez
 */
public class Area {//will be updated!

    private AreaType areaType;
    private Area leftNeighbour,rightNeighbour, upNeighbour, downNeighbour;
    private boolean visited, campFireExists, shelterExists;
    private String description;

    public Area(AreaType areaType){
        this.areaType = areaType;
        visited = false;
        campFireExists = false;
        shelterExists = false;
    }

    //mutators
    public void setLeftNeighbour(Area leftNeighbour){
        this.leftNeighbour = leftNeighbour;
    }

    public void setRightNeighbour(Area rightNeighbour){
        this.rightNeighbour = rightNeighbour;
    }

    public void setUpNeighbour(Area upNeighbour){
        this.upNeighbour = upNeighbour;
    }

    public void setDownNeighbour(Area downNeighbour){
        this.downNeighbour = downNeighbour;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setCampFireExists(boolean campFireExists){
        this.campFireExists = campFireExists;
    }

    public void setShelterExists(boolean shelterExists){
        this.shelterExists = shelterExists;
    }

    public void setVisited(boolean visited){
        this.visited = visited;
    }

    //Accessors
    public Area getLeftNeighbour(){
        return leftNeighbour;
    }

    public Area getRightNeighbour(){
        return rightNeighbour;
    }

    public Area getUpNeighbour(){
        return upNeighbour;
    }

    public Area getDownNeighbour(){
        return downNeighbour;
    }

    public AreaType getAreaType(){
        return areaType;
    }


    public boolean isVisited(){
        return visited;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCampFireExists(){
        return campFireExists;
    }

    public boolean hasLeftNeighbour(){
        return (leftNeighbour != null);
    }

    public boolean hasRightNeighbour(){
        return (rightNeighbour != null);
    }

    public boolean hasUpNeighbour(){
        return (upNeighbour != null);
    }

    public boolean hasDownNeighbour(){
        return (downNeighbour != null);
    }

    public boolean isShelterExists(){
        return shelterExists;
    }
}

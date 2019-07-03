package edu.mhromyk;

/**
 * Created by Maks on 7/3/2019.
 */
public class FileEntity {

    private int majorVersion;
    private int minorVersion;
    private int patchVersion;

    public FileEntity(int majorVersion, int minorVersion, int patchVersion) {
        this.majorVersion = majorVersion;
        this.minorVersion = minorVersion;
        this.patchVersion = patchVersion;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public int getPatchVersion() {
        return patchVersion;
    }

    @Override
    public String toString() {
        return "("+majorVersion + ", " + minorVersion+ ", " + patchVersion+")";
    }
}

package poro.module.db.data;

import java.sql.ResultSet;
import java.sql.SQLException;
import poro.module.CalendarManager;
import poro.module.db.DbExecuteQuery;

/**
 *
 * @author vinh
 */
public class Phong implements DbExecuteQuery {

    private int idSoTang;
    private int idPhong;
    private String tenPhong;
    private boolean choMuon;
    //-------------
    private boolean dangTrong;
    private int luotDat;

    public int getIdSoTang() {
        return idSoTang;
    }

    public void setIdSoTang(int idSoTang) {
        this.idSoTang = idSoTang;
    }

    public int getIdPhong() {
        return idPhong;
    }

    public void setIdPhong(int idPhong) {
        this.idPhong = idPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public boolean isChoMuon() {
        return choMuon;
    }

    public void setChoMuon(boolean choMuon) {
        this.choMuon = choMuon;
    }

    public boolean isDangTrong() {
        return dangTrong;
    }

    public int getLuotDat() {
        return luotDat;
    }

    private void setDangTrong(boolean dangTrong) {
        this.dangTrong = dangTrong;
    }

    private void setLuotDat(int luotDat) {
        this.luotDat = luotDat;
    }

    public static final int EXECUTE_SELECT_ALL = 0;
    public static final int EXECUTE_SELECT_BY_ID = 1;
    public static final int EXECUTE_INSERT = 2;
    public static final int EXECUTE_UPDATE_BY_ID = 3;
    public static final int EXECUTE_DELETE_BY_ID = 4;

    @SuppressWarnings("unchecked")
    @Override
    public Phong coverResultSet(ResultSet resultSet, int type) throws SQLException {
        Phong p = new Phong();
        p.setDangTrong(resultSet.getBoolean("is_trong"));
        p.setLuotDat(resultSet.getInt("luot_dat"));
        p.setIdSoTang(resultSet.getInt("so_tang"));
        p.setIdPhong(resultSet.getInt("id_phong"));
        p.setTenPhong(resultSet.getString("ten_phong"));
        p.setChoMuon(resultSet.getBoolean("is_cho_muon"));
        return p;
    }

    @Override
    public String getExecuteSQL(int type) {
        switch (type) {
            case EXECUTE_SELECT_ALL:
                return "{call get_phong_mp(?)}";
            case EXECUTE_SELECT_BY_ID:
                return "{call get_phong_mp_id (?, ?, ?)}";
            case EXECUTE_INSERT:
                return "INSERT INTO phong(so_tang, id_phong, ten_phong, is_cho_muon) VALUES (?, ?, ?, ?);";
            case EXECUTE_UPDATE_BY_ID:
                return "UPDATE phong SET ten_phong = ?, is_cho_muon = ? WHERE so_tang = ? AND id_phong = ?;";
            case EXECUTE_DELETE_BY_ID:
                return "DELETE FROM phong WHERE so_tang = ? AND id_phong = ?;";
            default:
                throw new RuntimeException("Không thể lấy câu SQL bằng kiểu có mã là: " + type);
        }
    }

    @Override
    public Object[] getExecuteData(int type) {
        switch (type) {
            case EXECUTE_SELECT_ALL:
                return new Object[]{CalendarManager.getNow()};
            case EXECUTE_SELECT_BY_ID:
                return new Object[]{CalendarManager.getNow(), this.idSoTang, this.idPhong};
            case EXECUTE_INSERT:
                return new Object[]{this.idSoTang, this.idPhong, this.tenPhong, this.choMuon};
            case EXECUTE_UPDATE_BY_ID:
                return new Object[]{this.tenPhong, this.choMuon, this.idSoTang, this.idPhong};
            case EXECUTE_DELETE_BY_ID:
                return new Object[]{this.idSoTang, this.idPhong};

            default:
                throw new RuntimeException("Không thể lấy dữ liệu cho câu SQL bằng kiểu có mã là: " + type);
        }
    }

}

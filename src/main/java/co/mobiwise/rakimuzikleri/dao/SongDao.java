package co.mobiwise.rakimuzikleri.dao;

import java.util.List;

import co.mobiwise.rakimuzikleri.model.Service;

public interface SongDao {

	public boolean addSong(Service service) throws Exception;
	public Service getSongById(long id) throws Exception;
	public List<Service> getRandomList() throws Exception;
	public List<Service> getMostViewList() throws Exception;
	public List<Service> getSongList() throws Exception;
	public boolean deleteSong(long id) throws Exception;
	public List<Service> getIsNotApprovedSongs() throws Exception;






}

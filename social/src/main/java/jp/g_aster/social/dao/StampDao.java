/**
 *
 */
package jp.g_aster.social.dao;

import java.util.List;

import jp.g_aster.social.dto.StampDto;
import jp.g_aster.social.entity.Stamp;

/**
 * スタンプDAO
 * @author hiroshi-abe
 *
 */
public interface StampDao {

	/**
	 * イベントＩＤに該当するデータを取得します。
	 * @param eventId
	 * @return
	 */
	List<Stamp> findByEventId(int eventId);


	/**
	 * イベントＩＤに該当するデータを取得します。
	 * @param eventId
	 * @return
	 */
	List<StampDto> findStampAndMemberFileByEventId(int eventId);

	/**
	 * イベントを登録します。
	 * @param event
	 */
	void insertStamp(Stamp stamp);


	/**
	 * イベントＩＤ、スタンプＩＤに該当するデータを取得します。
	 * @param eventId
	 * @return
	 */
	StampDto findStampAndMemberFileByStampId(int eventId,int stampId);

}

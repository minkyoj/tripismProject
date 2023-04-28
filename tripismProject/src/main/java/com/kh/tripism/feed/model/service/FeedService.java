package com.kh.tripism.feed.model.service;

import java.util.ArrayList;

import com.kh.tripism.feed.model.vo.Feed;
import com.kh.tripism.feed.model.vo.PageInfo;
import com.kh.tripism.feed.model.vo.Reply;


public interface FeedService {
	
	// 1. 피드 추가
	int insertFeed(Feed f);
	
	// 2. 피드 삭제
	int deleteFeed(int feedNo);
	
	// 3. 피드 수정
	int updateFeed(Feed f);
	
	// 4. 피드 리스트 조회
	int selectFeedCount();
	ArrayList<Feed> selectFeedList(PageInfo pi);
	
	// 5. 댓글 추가
	int insertReply(Reply r);
	
	// 6. 댓글 삭제
	int deleteReply(int replyNo);
	
	// 7. 댓글 수정
	int updateReply(int replyNo);
	
	// 8. 댓글 리스트 조회(ajax)
	ArrayList<Reply> selectReplyList(int FeedNo);
	
	// 9. 인기 피드 조회
	ArrayList<Feed> selectTopFeedList();

}
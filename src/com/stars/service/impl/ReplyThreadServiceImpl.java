/**
 * 
 */
package com.stars.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stars.entity.ReplyThread;
import com.stars.mapper.ReplyThreadMapper;
import com.stars.mapper.ThreadMapper;
import com.stars.service.ReplyThreadService;

/**
 * @author Administrator
 *
 */
@Service
@Transactional(readOnly=true)
public class ReplyThreadServiceImpl implements ReplyThreadService{

	
	@Autowired
	private ReplyThreadMapper replyThreadMapper;
	@Autowired
	private ThreadMapper threadMapper;
	/* (non-Javadoc)
	 * @see com.stars.service.ReplyThreadService#add(com.stars.entity.ReplyThread)
	 */
	@Override
	public void add(ReplyThread replyThread) {
		// TODO Auto-generated method stub
		replyThreadMapper.add(replyThread);
		
	}

	/* (non-Javadoc)
	 * @see com.stars.service.ReplyThreadService#getReplyThreadBytid(int)
	 */
	@Override
	public List<ReplyThread> getReplyThreadBytid(int tid) {
		// TODO Auto-generated method stub
		
		return replyThreadMapper.getReplyThreadBytid(tid);
	}

}

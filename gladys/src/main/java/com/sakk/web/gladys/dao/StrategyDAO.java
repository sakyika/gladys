package com.sakk.web.gladys.dao;

import java.util.List;
import com.sakk.web.gladys.model.Strategy;

public interface StrategyDAO {

	public void addStrategy(Strategy strategy);

	public Strategy getStrategy(int id);

	public void updateStrategy(Strategy strategy);

	public void deleteStrategy(int id);

	public List<Strategy> getStrategies();

}

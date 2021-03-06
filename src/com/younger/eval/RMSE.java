///**
// * Licensed to the Apache Software Foundation (ASF) under one or more
// * contributor license agreements.  See the NOTICE file distributed with
// * this work for additional information regarding copyright ownership.
// * The ASF licenses this file to You under the Apache License, Version 2.0
// * (the "License"); you may not use this file except in compliance with
// * the License.  You may obtain a copy of the License at
// *
// *     http://www.apache.org/licenses/LICENSE-2.0
// *
// * Unless required by applicable law or agreed to in writing, software
// * distributed under the License is distributed on an "AS IS" BASIS,
// * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// * See the License for the specific language governing permissions and
// * limitations under the License.
// */
//
//package com.younger.eval;
//
//import com.younger.sample.TrainDatas;
//
///**
// * @author Yasser Ganjisaffar <ganjisaffar at gmail dot com>
// */
//
//public class RMSE extends EvaluationMetric {
//	
//	public RMSE() {
//		super(false);
//	}
//	
//	@Override
//public double measure(double[] predictions, TrainDatas sample) {
//double rmse = 0;
//		double diff;
//		for (int i = 0; i < sample.size; i++) {
//			diff = sample.targets[i] - predictions[i];
//			rmse += diff * diff;
//		}
//		rmse = Math.sqrt(rmse / sample.size);
//		return rmse;
//	}
//
//	@Override
//	public double measure(Integer[] predictions, TrainDatas sample) throws Exception {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}

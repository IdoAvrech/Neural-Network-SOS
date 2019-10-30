import java.util.Scanner;

public class Main {

	public static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		final int datalength = 1360;
		final int neurons = constants.inputneurons;
		final int middle = constants.middleneurons;
		double[] datadouble = new double[]{6281.645284,6280.041314,6284.486393,6283.462724,6277.232888,6275.203936,6275.698598,6249.076236,6183.97778,6399.60282,6515.393697,6699.213514,7360.238655,7263.067297,7302.968656,7200.105018,7012.338561,6984.463549,7033.937515,7079.540613,6909.059845,6702.39195,6733.726421,6683.66633,6525.526663,6360.216985,6480.164089,6256.476566,6477.564583,6391.086269,6582.51729,6316.084523,6266.704155,6186.971207,6249.89022,6305.92516,6223.424594,6145.965312,6479.448902,6460.572895,6721.43509,7402.788687,7411.537604,7395.622456,7417.696546,7527.040399,7599.719712,7732.347291,8173.961808,8215.215993,8228.600109,8184.134275,7933.125251,8175.218632,8402.835041,7721.939481,7400.464661,7399.627548,7337.622589,7471.084287,7369.919531,7313.6932,6720.665206,6355.493533,6253.628695,6244.786536,6381.8725,6302.49,6664.20625,6704.1825,6755.56125,6600.98625,6531.2,6584.76625,6504.92625,6613.27,6347.85875,6387.30625,6203.90125,5848.26375,6132.5625,6074.9175,6247.4675,6150.18875,6170.56,6053.89625,6717.2025,6758.37875,6737.41375,6709.48,6443.6725,6485.86875,6389.87,6637.73875,6299.5225,6548.33,6877.1825,6765.80125,7497.34375,7616.1025,7688.00375,7655.97875,7616.89125,7490.59,7711.365,7636.19375,7518.245,7487.1875,7375.67,7460.58375,7105.6725,7344.9675,7334.16375,7460.69375,7578.69125,7502.55875,7983.5175,8395.2325,8520.8125,8234.1525,8240.725,8058.60375,8340.29875,8474.23875,8675.20624,8688.02875,8467.65625,8406.17499,9014.615,9306.0,9180.15875,9362.53375,9619.14374,9826.5975,9692.7175,9734.67499,9219.86375,9067.715,9244.3225,9392.03125,9342.47125,8920.86666,9278.9975,8864.0875,9652.15625,8938.30374,8792.83,8917.59625,8863.5025,8273.74124,8163.69,7890.15,8051.345,8357.0375,8003.68125,7889.23125,7916.3725,6939.55,6830.90375,6773.93875,7022.70875,6896.28125,6620.40875,6774.75125,6789.30125,7417.8875,7049.79375,6816.74,6926.0175,6844.32125,7086.4875,7937.205,7790.1575,8138.33625,8449.83499,8535.89374,8918.74375,8712.89125,8895.4,8915.90375,8594.19125,8196.02249,7862.10875,8269.3275,8256.99375,8196.89749,9144.14749,9118.27125,9532.74124,8848.03624,9231.05374,9266.12,9937.4325,10764.38,11555.69875,11387.33125,11387.2925,11102.44,10966.85875,10417.72625,10725.48375,10352.97374,9666.23749,9612.44,10146.28249,9959.69875,10450.33875,11368.9925,11074.605,10587.0875,10949.375,10207.475,10089.47875,9439.715,8551.49875,8888.23749,8305.45624,8573.20999,8585.24,8218.3925,7853.09375,7642.68125,6806.325,8407.37999,9102.72374,8769.26125,8973.79375,10071.42499,10169.21375,11062.7975,11698.10375,11454.07625,10796.50875,11158.7025,11103.4075,11046.01375,10669.06875,11208.6625,12844.775,11256.76125,11286.085,11114.36625,11123.385,13801.02,13572.29875,14315.75,13639.22875,13105.57375,14486.28,14420.79625,14693.0,16426.82624,17071.78749,16948.3125,15038.535,14848.8475,14843.80625,13494.44375,13907.92375,12933.305,14514.78625,14062.87375,15279.98125,15719.89125,13806.2175,13668.2875,15008.0575,14976.25625,15594.70833,16297.66625,17228.925,18770.94374,19395.83875,19385.64125,17587.78,16510.6825,16504.56125,17381.77375,16930.13499,14605.91,14860.1375,15915.755,16605.33,13805.77125,11735.4225,11484.5,11086.325,10955.3425,10823.42125,9810.775,9993.20125,9930.27375,9657.62624,9347.2425,8694.205,8257.09499,8129.81875,8261.34,7982.88,8259.65375,8022.5225,7823.73125,7763.91125,7791.20875,7251.52,6572.4725,6448.225,5674.905,6318.31375,6701.73125,7118.03125,7400.26375,7077.3225,6981.09375,7346.63,7386.99875,7161.45125,7030.0025,6750.1725,6447.6675,6121.8,6140.53125,5732.825,5767.68,5888.145,5733.90375,5518.85,5895.29875,5984.95625,6013.22875,5984.08625,5699.58375,5572.19875,5595.235,5754.22125,5699.00125,5809.69375,5640.1275,5439.13375,4830.76624,4754.69874,4772.975,4596.96249,4437.03374,4370.245,4322.755,4225.92375,4320.09,4404.0975,4394.63875,4353.04749,4164.10375,4185.29249,4208.56125,3895.5125,3927.49875,3662.12,3777.29375,3603.30875,3612.68125,3858.08875,3896.99875,4067.0775,3672.56625,3678.7375,3686.9,3226.4125,3874.25875,4148.2675,4188.845,4191.175,4291.88,4317.5375,4638.0975,4626.72,4422.12125,4319.72124,4631.695,4643.975,4950.72375,4764.8675,4630.7275,4648.13375,4439.65874,4394.515,4387.46125,4408.32374,4362.475,4191.2175,4137.67249,4054.9425,4111.22,4206.13125,4159.4575,4316.34,4425.29625,4204.43,4382.74125,4111.19625,3917.64875,3679.6075,3445.28,3377.54375,3453.1625,3431.96875,3255.0025,3301.75875,2883.68125,2814.36125,2723.58,2735.5875,2874.3125,2746.32625,2720.08,2805.17875,2697.4725,2550.17999,2591.21625,2779.04375,2762.62625,2838.81,2694.29125,2877.38625,2294.405,2327.8975,2244.265,1938.9425,1993.25875,2232.655,2364.51625,2423.16,2332.1875,2371.96,2525.675,2579.93375,2521.23625,2619.1125,2629.2725,2625.07125,2581.06625,2534.79333,2460.19999,2499.98375,2561.56125,2584.56374,2593.17,2485.35875,2594.45375,2619.11875,2738.225,2740.79,2712.4775,2778.8275,2641.665,2576.17125,2663.9975,2528.1025,2456.92375,2494.485,2738.93125,2682.59499,3018.545,2942.345,2826.7,2825.03125,2694.21875,2914.0825,2736.595,2552.80875,2555.65375,2517.40875,2452.18125,2330.23375,2197.23375,2289.87,2207.5775,2106.3075,2247.4825,2357.50375,2476.29625,2291.4775,2139.0275,2055.61749,2051.735,1968.1025,1887.32625,1802.16375,1718.20125,1697.37875,1772.41625,1759.96125,1676.99375,1807.3725,1756.8025,1706.93125,1639.3225,1555.47125,1548.28625,1512.39,1515.62875,1491.99875,1443.6825,1402.08375,1347.95875,1327.03875,1320.05125,1329.19,1284.845,1263.545,1248.325,1248.2175,1244.375,1257.135,1255.403,1226.93899,1217.596,1203.731,1184.787,1180.699,1183.44,1178.53299,1216.50499,1224.767,1213.339,1210.05499,1184.824,1193.019,1190.597,1134.998,1143.74599,1147.63099,1098.776,1089.511,1079.748,1037.527,1040.392,1044.251,1040.491,965.229,964.692,935.94599,1029.95,1037.44,1115.039,1041.343,1017.8,970.598,1070.128,1172.909,1259.601,1246.309,1243.242,1229.50499,1178.78299,1093.492,1189.002,1169.298,1230.231,1279.652,1276.444,1268.181,1287.085,1263.227,1226.518,1192.628,1190.026,1177.708,1152.64899,1180.599,1175.93799,1122.2825,1123.26624,1061.03125,1054.61375,1057.5175,1057.01375,1033.0925,1010.08,1010.05875,998.3475,1000.7225,1011.44125,999.225,980.69125,1057.47499,1051.73,1025.62625,1013.6475,1032.60375,1014.99125,1007.69,985.36625,967.0275,921.13625,914.8825,920.11625,919.43,915.97625,893.56375,888.7775,920.79625,919.505,920.15875,892.18875,893.74625,873.06,904.8775,829.195,817.7075,813.9575,822.84125,813.09125,783.81875,906.97875,899.6325,912.5175,896.75375,889.5225,1011.24875,1137.14,1027.07375,1019.09,1002.5525,965.5975,959.81625,966.8925,972.735,928.6675,900.7575,892.42,895.59875,917.76,861.01375,825.78,794.715,789.44125,788.12625,789.22875,781.48375,776.16375,775.4925,778.895,778.06625,768.225,773.23125,769.8425,768.90625,765.74625,758.93,753.36375,763.9025,764.52625,771.87,753.09875,741.88875,731.365,731.44375,729.80625,732.90625,736.545,735.98125,740.9075,747.6075,737.79375,727.9275,750.18,749.3,736.7325,739.17375,711.71375,706.5825,702.3975,703.79625,715.19,711.43625,720.36125,710.685,706.84875,713.57,704.16375,702.5375,687.5075,742.465,729.27125,697.36875,696.35375,712.87,688.09625,686.52,674.3575,652.895,648.39874,649.245,652.715,630.15374,628.62249,628.15374,635.50875,636.91999,639.8275,637.37125,638.36749,635.02,635.08124,639.37375,617.4225,614.62375,616.59625,616.48875,610.9,610.885,609.375,612.3375,610.29125,613.93375,608.4375,605.05875,603.51874,604.7625,606.8125,599.17625,601.34124,601.71375,595.035,595.79875,599.47375,608.5275,608.69875,605.29375,606.33375,605.21,608.22,606.92125,606.3075,605.80875,622.2125,621.79625,624.94875,614.7875,611.07,606.0275,608.9175,598.38375,574.1475,571.69375,572.33375,575.99875,572.36125,573.55499,568.66625,578.15625,575.73375,577.995,581.28125,584.73249,580.69,580.7025,573.66375,572.5025,571.745,576.24875,567.2025,571.865,585.08124,586.02625,586.525,592.8925,584.75875,590.62249,592.78,588.4225,574.95624,578.32125,565.26374,552.821,607.374,625.881,654.976,656.669,655.627,655.442,651.077,655.135,661.04999,654.862,650.822,665.09899,666.18,673.843,673.594,679.051,663.54099,664.876,659.636,653.934,664.839,649.027,649.962,650.627,664.743,639.761,676.113,668.092,681.63,659.688,703.68599,676.52299,672.485,639.082,646.304,658.399,630.246,665.32899,665.162,625.495,602.88699,665.876,728.983,764.045,755.684,747.554,768.242,696.323,685.989,705.61899,675.343,611.777,579.131,576.45399,583.105,577.856,585.531,574.106,573.45,570.471,538.145,536.424,531.797,532.586,524.083,525.433,473.467,453.81899,449.234,445.13,443.734,438.773,443.135,442.953,436.729,453.378,452.746,453.41,457.84799,455.753,455.735,454.818,452.113,450.987,461.491,459.437,459.465,460.374,448.527,446.962,450.274,444.513,453.042,449.333,456.35,449.856,445.012,467.803,462.51,460.327,452.584,447.636,451.102,442.156,436.105,429.054,427.862,430.837,429.98,425.106,424.401,425.98999,422.98999,421.111,418.419,418.089,421.204,421.7,422.653,419.416,419.385,419.686,417.009,415.16099,412.68999,415.553,422.756,425.378,416.73,415.687,414.341,417.386,416.926,411.42299,410.751,408.52,408.036,418.452,416.253,415.383,415.091,412.291,410.856,419.515,416.051,412.047,411.803,413.612,407.947,400.941,408.037,420.202,424.7,432.159,436.963,432.38,431.92299,427.025,422.901,423.64399,420.789,437.633,439.178,440.0,419.23999,422.261,418.534,406.883,398.44,404.374,389.904,382.469,376.543,379.367,373.906,371.357,375.459,375.096,385.815,388.61,367.573,373.286,370.756,374.458,376.979,380.646,379.105,394.617,395.411,392.901,402.854,390.006,377.708,412.106,416.499,380.457,385.092,386.258,382.674,367.159,430.148,432.625,446.052,448.36,447.15,450.773,454.515,456.277,431.331,432.4,434.97799,429.189,434.151,433.919,431.058,427.101,429.378,421.113,423.954,415.67299,455.956,454.58599,442.687,435.459,434.921,442.477,461.327,463.562,455.706,454.51599,463.763,443.216,435.438,433.753,449.43199,416.108,417.395,395.907,396.179,394.6,390.447,362.274,361.133,359.754,363.188,378.234,373.105,355.496,359.888,351.405,327.755,320.10199,323.27499,323.75799,324.838,321.522,327.252,335.931,337.346,329.869,320.791,337.487,339.76,332.761,306.721,333.392,381.906,374.332,387.143,374.932,390.815,393.076,397.95016,360.07883,324.72208,312.43208,326.0045,313.31129,303.88658,294.39975,286.1325,283.07166,282.6605,277.45541,274.41083,267.32716,270.21875,264.41583,262.90024,271.20391,262.93525,254.81325,252.59491,249.93516,245.58558,247.52525,245.33133,244.32125,242.6905,243.26641,246.42183,240.58716,238.68741,239.08908,237.40208,237.56975,236.2455,236.62891,239.34275,232.84858,234.20825,234.83791,234.28324,229.95558,230.52366,226.60558,230.8605,231.23816,232.71666,232.79241,228.79758,229.92408,230.24058,230.328,234.8185,240.08383,238.58958,238.29158,243.54725,240.02016,239.43833,234.67708,230.08508,226.765,228.85508,227.34691,230.01725,228.60883,229.75616,230.9825,224.261,225.37983,221.71175,209.13216,227.589,229.74441,231.94058,234.68724,225.39441,219.0045,256.98399,257.6735,260.73425,264.86858,263.33708,265.64175,270.91666,263.7615,264.43874,260.2,279.03024,278.25158,281.37833,284.50333,280.47958,281.65,280.03708,283.94166,287.28974,288.76808,293.78508,292.73058,291.63716,288.13425,287.97383,275.62658,276.61741,275.0995,278.41388,272.48887,274.49374,278.48825,277.82725,283.82312,286.18562,290.88112,309.97775,291.68725,283.88099,268.11337,269.64587,264.95662,268.4935,271.01524,260.34875,255.59612,254.3505,257.66037,262.48424,256.4875,248.06725,250.70662,242.64237,242.422,239.9703,243.9862,247.0328,244.01,245.2612,243.54699,248.8732,249.1681,250.8977,237.3096,233.8536,232.7533,230.2041,230.01889,228.9521,229.3327,228.6452,223.3896,225.6791,224.7,224.371,225.6452,225.7461,223.3086,229.9992,233.29389,237.1049,237.4716,237.1847,237.3271,237.4879,241.1864,239.0331,240.519,235.30479,234.2455,231.9434,232.8655,236.0996,235.7265,237.3101,236.9272,235.7981,240.99,241.8539,239.63119,240.4825,243.3946,237.7829,230.0478,236.5532,238.7688,240.1203,234.9045,232.1241,236.5704,225.9764,225.7413,228.4994,218.815,225.8529,230.786,235.6246,233.923,235.9,224.3076,221.6913,222.843,222.2325,228.107,223.5659,218.2741,223.4056,235.6352,236.117,235.22013,243.2604,244.36038,252.7965,254.5187,259.9451,253.1206,253.5439,252.2566,246.5548,243.3894,246.852,242.0165,252.252,246.5814,247.648,246.1339,245.4422,265.9432,267.7968,259.6162,260.838,259.7404,255.3662,284.45529,290.3763,285.3415,281.36149,284.2838,293.8751,295.8301,290.512,288.85289,274.47539,274.8281,272.3947,274.98359,272.1934,282.7471,269.0337,258.3364,253.18683,255.18666,236.22708,237.22875,238.73116,238.70666,235.39058,244.41975,244.01833,240.56966,234.47349,242.5155,236.10066,233.20708,258.70758,235.75441,221.97041,219.19983,220.631,221.01116,222.789,227.972,224.00633,217.14958,224.48416,228.48125,232.81908,227.67716,222.42258,228.65525,231.63691,231.0895,262.185,268.5526,253.0305,246.6773,231.70279,231.00259,226.5571,210.4597,214.62265,209.0353,199.0036,207.51819,207.9396,173.94227,223.164,269.265,266.363,274.376,287.6125,283.02875,295.105,283.73625,271.77125,259.559,287.70614,314.404,314.443,316.906,310.10199,313.183,316.173,315.242,328.774,318.042,322.35199,333.259,328.99699,321.44799,328.375,317.212,311.828,319.724,329.361,345.403,350.19,347.289,351.831,346.775,346.404,350.759,364.7014,374.217,373.557,376.652,369.317,375.4035,380.84,379.22899,376.9228,375.338,379.1503,368.326,366.663,376.145,378.455,369.365,352.38,349.16666,356.31833,375.38,376.475,386.69,387.665,376.29333,397.255,415.71166,417.45333,366.015,367.31666,358.65833,344.82666,340.56333,347.95666,338.14333,326.58333,324.04166,324.93317,324.477,336.53767,343.66875,333.305,351.71375,348.94,351.2925,345.95,355.145,355.82,379.07,382.29375,379.355,386.4425,388.8275,380.2025,379.95375,391.82625,398.6425,388.37375,376.03,358.97875,358.6,363.54125,352.6363,333.96625,328.42874,319.57125,325.36375,356.4125,371.8525,381.1575,386.6,374.52,376.10625,398.2,401.6725,408.56,422.16,435.2275,398.74125,396.35,406.6425,391.8175,421.42625,454.88625,463.50375,471.23375,474.57,476.84125,473.64375,476.17375,477.35875,471.43375,471.9725,479.47375,481.9925,480.41625,488.935,474.3675,475.07125,473.98125,477.84875,501.15125,506.85375,510.2275,513.275,501.55375,508.50875,497.0025,513.8375,515.995,511.745,486.6475,460.54875,492.79375,519.59375,496.41125,508.49125,544.54875,567.98125,573.17625,589.3125,588.0625,590.38375,587.32125,582.92499,582.88874,586.5725,585.4375,587.17875,595.0375,581.16999,564.29,582.035,584.44375,590.82375,593.8525,599.78375,599.98125,617.73875,618.67499,619.9475,621.17999,625.67499,628.04875,622.385,615.15125,619.15,618.2975,627.49249,634.4125,631.09375,614.9625,620.37875,620.04125,617.80499,631.6675,628.2575,626.8025,640.49875,647.3125,635.41625,639.15374,598.43666,591.95333,600.72,579.11166,561.95166,574.91999,587.38666,598.81333,590.935,588.205,592.05666,604.615,607.02333,587.92833,591.675,571.55666,597.39166,581.69999,627.81166,649.77333,645.18833,653.46,652.515,645.55833,655.88666,636.59666,665.41333,658.68666,628.69999,623.22333,616.36166,565.215,574.31666,569.44833,581.77166,569.84333,525.44833,518.77166,526.05,489.005,485.52333,444.00666,444.795,446.27166,444.71833,444.24,441.51666,437.16,438.42333,436.315,452.70833,448.00166,435.13666,436.92,426.775,429.42149,433.74466,436.6683,446.34666,456.23677,445.80035,444.21999,436.79333,429.605,456.00333,459.48927,500.22333,486.78166,484.26163,492.9984,497.12835,501.22833,478.07283,494.23499,528.82933,520.12333,457.58166,414.61666,420.64833,419.88316,360.51516,440.07331,450.25915,446.21851,460.67,464.56668,448.82166,446.99533,437.3483,478.39963,458.44666,461.5498,492.91163,502.28493,477.83,579.07166,582.28,585.9931,561.22475,564.235,570.44663,586.50325,608.53235,613.52998,621.15,630.42833,633.36666,626.45666,638.10166,630.98249,628.9525,625.3525,632.8025,615.9,623.15,653.61249,659.0125,663.75,659.74249,553.02,566.25,550.355,576.85749,582.225,532.4,548.7,607.7875,595.415,563.5475,560.82,618.6,619.39,622.135,592.635,648.04999,659.59,611.51,655.9,655.7025,662.7875,684.86775,668.96776,723.54833,780.88344,837.92333,843.4575,847.91666,853.94499,856.85019,846.94018,844.44833,837.77624,841.31303,815.55983,878.47833,862.69171,825.76,855.96,862.29499,871.285,878.32415,864.90473,841.58414,832.43616,852.15,877.58798,858.18333,861.12597,878.20379,920.85465,881.50399,861.2025,846.58166,835.16666,944.63166,938.09999,859.19,828.96166,814.74112,769.27216,756.22583,756.49074,749.1795,733.19583,739.91666,776.89483,682.66655,665.54,673.49833,627.20383,610.42367,623.0915,690.24649,538.20379,684.87633,720.7725,874.175,867.6425,876.511,873.92627,880.3415,987.1889,888.475,797.81283,702.51496,881.88649,1041.87999,1148.32666,1066.6665,1028.59583,952.74833,1129.47647,1114.87653,1051.45,947.38,883.125,776.9975,757.95525,770.7225,753.37424,699.7475,554.53499,549.26625,637.82474,482.07375,428.6155,404.648,410.5575,396.625,347.9005,330.3575,312.0025,342.97949,318.41274,284.38016,254.16083,239.1765,222.59833,206.23666,200.84733,198.50983,198.22633,194.54933,198.19316,190.42166,187.36483,176.05283,181.10316,186.39033,200.605,186.11466,174.303,163.19683,161.253,150.21716,142.57833,137.24833,139.70316,133.60299,130.05683,126.18982,125.62266,125.45583,125.79333,124.05149,123.04583,121.65683,121.18516,121.17883,116.967,100.81083,125.58083,123.25983, };
		Point[] data = new Point[datadouble.length];
		for(int i = 0; i<data.length; i++) {
			data[i] = new Point(datadouble[i], i);
		}

		Point[][] TrainData = new Point[datalength-neurons+1][neurons];
		for(int i = 0; i<TrainData.length; i++) {
			for(int j = 0; j<neurons; j++) {
				TrainData[i][j] = data[i+j];
			}
		}
		/*
		for(int i = 0; i<TrainData.length; i++) {
			for(int j = 0; j<neurons; j++) {
				System.out.print(i+", " + j + " "+TrainData[i][j] + " ");
			}
			System.out.println();
		}*/


		double[][] Weights = new double[middle][neurons+1];
		for(int i = 0; i<Weights.length; i++) {
			for(int j = 0; j<Weights[i].length; j++) {
				Weights[i][j] = constants.start;
			}
		}
		double[] WeightsEnd = new double[middle+1];
		for(int j = 0; j<WeightsEnd.length; j++) {
			WeightsEnd[j] = constants.start;
		}
		/*
		Point[] TestData = new Point[365];
		for(int i = 0; i<TestData.length; i++) {
			double value = kb.nextDouble();
			TestData[i] = new Point(value, i);
			System.out.println(TestData[i]);
		}*/



		Neural MyNetwork = new Neural(TrainData[0], Weights, WeightsEnd);
		//System.out.println(MyNetwork.Middle.Neurons[1].sigmoid(10000));
		MyNetwork.FixEverything(TrainData);
		MyNetwork.PrintWeights();
		double[] test = new double[]{20.43,19.88,19.9,19.71,19.74,20.23,20.19,20.04,20.46,20.67,20.56,20.57,20.36,20.48};
		Point[] smalltest = new Point[test.length];
		for(int i = 0; i<test.length; i++) {
			smalltest[i] = new Point(test[i], i);
		}
		System.out.println("idodi is amazing "+MyNetwork.run(smalltest));
		char ans;
		do {
			for(int i = 0; i<test.length; i++) {
				smalltest[i].y = kb.nextDouble();
			}
			System.out.println("idodi is amazing "+MyNetwork.run(smalltest));
			System.out.println("do you want to continue");
			ans = kb.next().charAt(0);
		}while(ans == 'y');





	}

}

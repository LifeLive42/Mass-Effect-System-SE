//* Iera System *//
Planet	"Venture"
{
	ParentBody     "Iera"
	Class	       "Desert"

	Mass            2
	Radius          10659
	InertiaMoment   0.327448

	RotationPeriod  26.1
	Obliquity       0.07026
	EqAscendNode    0.316

	AlbedoBond      0.2
	AlbedoGeom      0.24
	Brightness      2
	Color          (0.794 0.711 0.760)

	Surface
	{
		SurfStyle       0.0159249
		OceanStyle      0.651675
		Randomize      (-0.197, 0.284, -0.249)
		colorDistMagn   0.0579459
		colorDistFreq   629.157
		detailScale     11472.3
		colorConversion true
		seaLevel        0.0213779
		snowLevel       2
		tropicLatitude  0.049886
		icecapLatitude  10
		icecapHeight    0.187823
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.573103
		venusFreq       1.49063
		venusMagn       0
		mareFreq        0.897629
		mareDensity     0.0983323
		terraceProb     0.278884
		erosion         0
		montesMagn      0.231909
		montesFreq      229.887
		montesSpiky     0.849683
		montesFraction  0.828592
		dunesMagn       0.0344311
		dunesFreq       33.4969
		dunesFraction   0.306682
		hillsMagn       0.130065
		hillsFreq       453.895
		hillsFraction   0
		hills2Fraction  0
		riversMagn      62.5788
		riversFreq      4.94892
		riversSin       6.37926
		riversOctaves   0
		canyonsMagn     0.00413556
		canyonsFreq     114.861
		canyonFraction  0
		cracksMagn      0.126231
		cracksFreq      0.321396
		cracksOctaves   0
		craterMagn      0.603247
		craterFreq      15.1197
		craterDensity   0.487847
		craterOctaves   6.5624
		volcanoMagn     0.677088
		volcanoFreq     1.23753
		volcanoDensity  0.32574
		volcanoOctaves  1
		volcanoActivity 1.09784
		volcanoFlows    0.69583
		volcanoRadius   0.363081
		volcanoTemp     1371.95
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0, 0, 0, 0.000)
		colorShelf     (0, 0, 0, 0.000)
		colorBeach     (0.105, 0.520, 0.480, 0.000)
		colorDesert    (0.390, 0.360, 0.330, 0.000)
		colorLowland   (0.105, 0.105, 0.105, 0.000)
		colorUpland    (0.390, 0.360, 0.330, 0.000)
		colorRock      (0.170, 0.160, 0.160, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.107, 0.142, 0.035, 0.000)
		colorUpPlants  (0, 0, 0, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.577841
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          35.6797
		Coverage        0.134944
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          78.927
		Pressure        57
		Greenhouse      160
		Bright          8.4158
		Opacity         1
		SkyLight        2.80527
		Hue             0.0480141
		Saturation      1

		Composition
		{
			N2   	75
			C02		25
		}
	}

	Aurora
	{
		Height      80.0826
		NorthLat    71.3749
		NorthLon    147.913
		NorthRadius 1087.78
		NorthWidth  967.101
		NorthRings  5
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -61.8014
		SouthLon    322
		SouthRadius 1241.3
		SouthWidth  1201.03
		SouthRings  4
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   0.7
		Period          0.6
		Eccentricity    0.0065355
	}
}

Planet	"Prospect"
{
	ParentBody     "Iera"
	Class	       "GasGiant"

	Mass            156
	Radius          45277.8
	InertiaMoment   0.200609

	Oblateness      0.0517601

	RotationPeriod  18.1
	Obliquity       0.15294
	EqAscendNode    0.687

	AlbedoBond      0.502764
	AlbedoGeom      0.603317
	Brightness      2
	Color          (0.139 0.069 0.019)

	Surface
	{
		SurfStyle       0.178923
		Randomize      (0.198, -0.299, 0.437)
		detailScale     200082
		colorConversion true
		tropicLatitude  0.181326
		icecapLatitude  1
		mainFreq        0.0204138
		venusFreq       7.78119
		venusMagn       0.494462
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      3.18538
		twistMagn       1.05892
		cycloneMagn     12.6935
		cycloneFreq     0.293593
		cycloneDensity  0.0501413
		cycloneOctaves  2
		colorLayer0    (0.178, 0.034, 0.034, 1.100)
		colorLayer1    (0.205, 0.092, 0.092, 0.800)
		colorLayer2    (0.139, 0, 0, 0.200)
		colorLayer3    (0.139, 0, 0, 0.050)
		colorLayer4    (0.139, 0, 0.139, 0.000)
		colorLayer5    (0.128, 0, 0, 0.000)
		colorLayer6    (0.255, 0.215, 0, 0.000)
		colorLayer7    (0.139, 0, 0, 1.000)
		colorLowPlants (0.720, 0.720, 0.720, 0.000)
		colorUpPlants  (0.780, 0.780, 0.780, 0.000)
		BumpHeight      9.6225
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          54.5
		BumpHeight      55.5034
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        1.3757
		mainOctaves     10
		Coverage        0.527641
		twistZones      3.18538
		twistMagn       1.05892
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          400
		Density         5509.21
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.071
		Saturation      2

		Composition
		{
			H2    	90
			N2    	10
		}
	}

	Aurora
	{
		Height      2366.02
		NorthLat    82.9958
		NorthLon    -55.9889
		NorthRadius 18761.5
		NorthWidth  9658.17
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -83.1243
		SouthLon    116.001
		SouthRadius 15876
		SouthWidth  9819.49
		SouthRings  5
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   1.2
		Period          1.3
		Eccentricity    0.0145632
		Inclination     0
		ArgOfPericenter 303.726
		MeanAnomaly     283.124
	}
}

Planet	"Horizon"
{
	ParentBody     "Iera"
	Class          "Terra"
	Mass            0.498
	Radius          5402
	RadiusInfo      5402
	InertiaMoment   0.335645
	Oblateness      0.00383029
	RotationPeriod  37.8
	Obliquity       0
	EqAscendNode    0

	AlbedoBond      0.328835
	AlbedoGeom      0.394602
	Brightness      2
	BrightnessHDR   1

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
	}

	Surface
	{
		SurfStyle       0.116706
		OceanStyle      0.447969
		Randomize      (0.684, -0.132, 0.038)
		colorDistMagn   0.0502624
		colorDistFreq   735.334
		detailScale     15203.3
		colorConversion true
		drivenDarkening -1
		seaLevel        0.488944
		snowLevel       1
		tropicLatitude  0.00468342
		icecapLatitude  1
		icecapHeight    0.182035
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.687744
		venusFreq       0.596848
		venusMagn       0.542038
		mareFreq        5.11764
		mareDensity     0.0600704
		terraceProb     0.229412
		erosion         0.1268
		montesMagn      0.101501
		montesFreq      900.506
		montesSpiky     0.985909
		montesFraction  0.844555
		dunesMagn       0.0707365
		dunesFreq       49.9816
		dunesFraction   0.652163
		hillsMagn       0.106844
		hillsFreq       300.452
		hillsFraction   0.610779
		hills2Fraction  0.959947
		riversMagn      58.1471
		riversFreq      3.33333
		riversSin       5.93701
		riversOctaves   2
		canyonsMagn     0.0220699
		canyonsFreq     148.052
		canyonsFraction 0.404224
		cracksMagn      0.0658838
		cracksFreq      0.474019
		cracksOctaves   0
		craterMagn      0.558991
		craterFreq      100
		craterDensity   0
		craterOctaves   0
		craterRayedFactor 0
		volcanoMagn     0.758994
		volcanoFreq     0.564885
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 0.503817
		volcanoFlows    0.389313
		volcanoRadius   0.294116
		volcanoTemp     1417.21
		lavaCoverTidal  0.239404
		lavaCoverSun    0
		lavaCoverYoung  0
		stripeZones     2.69939
		stripeFluct     0
		stripeTwist     0.179592
		cycloneMagn     1.0687
		cycloneFreq     0.0610687
		cycloneDensity  0.0118092
		cycloneOctaves  1
		colorVary	(0.670, 0.580, 0.360, 0.000)
		colorSea	(0.099, 0.200, 0.273, 1.000)
		colorShelf	(0.150, 0.480, 0.460, 1.000)
		colorBeach	(0.820, 0.730, 0.570, 0.000)
		colorDesert	(0.420, 0.360, 0.220, 0.000)
		colorLowland	(0.220, 0.230, 0.220, 0.000)
		colorUpland	(0.570, 0.540, 0.420, 0.000)
		colorRock	(0.100, 0.100, 0.100, 0.000)
		colorSnow	(1.000, 1.000, 1.000, 1.308)
		colorLowPlants	(0.034, 0.139, 0.034, 0.000)
		colorUpPlants	(0.570, 0.540, 0.420, 0.000)
		BumpHeight      19.9986
		BumpOffset      12.7782
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
		RingsWinter     0
	}

	Clouds
	{
		Height          2.85303
		Velocity        18.547
		BumpHeight      5.55179
		BumpOffset      0.01
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		RingsWinter     0
		mainFreq        1.03508
		mainOctaves     10
		Coverage        0.366412
		stripeZones     2.69939
		stripeFluct     0
		stripeTwist     0.179592
		colorClouds0	(1.000, 1.000, 1.000, 1.000)
		colorClouds1	(1.000, 1.000, 1.000, 1.000)
		colorClouds2	(1.000, 1.000, 1.000, 1.000)
		colorClouds3	(1.000, 1.000, 1.000, 1.000)
	}

	Ocean
	{
		Height          9.7782
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          51.2771
		Density         6.27413
		Pressure        1.68
		Greenhouse      106
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.0572519
		Saturation      0.519084

		Composition
		{
			N2    	70
			O2    	20
			CO2   	7
			H2O   	3
		}
	}

	Aurora
	{
		Height      101.789
		NorthLat    78.4809
		NorthLon    138.231
		NorthRadius 1563.54
		NorthWidth  1950.94
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -84.2113
		SouthLon    180
		SouthRadius 1224.79
		SouthWidth  1139.65
		SouthRings  3
		SouthBright 0.3
		SouthParticles 50000
		TopColor    (1.000 1.000 1.000)
		BottomColor (0.000 1.000 0.000)
	}

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		Period          3
		SemiMajorAxis   2.1
		Eccentricity    0.0345106
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     9.22809
	}
}

Planet	"Watchman"
{
	ParentBody     "Iera"
	Class	       "IceWorld"

	Mass            0.64
	Radius          5728
	InertiaMoment   0.362537

	Oblateness      0.00319516

	RotationPeriod  28.6
	Obliquity       40.667
	EqAscendNode    -132.722

	AlbedoBond      0.3
	AlbedoGeom      0.36
	Brightness      2
	Color          (0.919 0.856 0.776)

	Surface
	{
		SurfStyle       0.301811
		OceanStyle      0.285571
		Randomize      (0.823, 0.109, 0.699)
		colorDistMagn   0.0789329
		colorDistFreq   258.888
		detailScale     6272.16
		colorConversion true
		drivenDarkening 0
		seaLevel        0.187031
		snowLevel       2
		tropicLatitude  0.509382
		icecapLatitude  1
		icecapHeight    0.187031
		climatePole     0.4375
		climateTropic   0.3125
		climateEquator  0.6875
		heightTempGrad  0.625
		tropicWidth     0.07
		mainFreq        1.71135
		venusFreq       0.646148
		venusMagn       0.263074
		mareFreq        1.16083
		mareDensity     0.00259516
		terraceProb     0.339808
		erosion         0
		montesMagn      0.139468
		montesFreq      122.605
		montesSpiky     0.974279
		montesFraction  0.423291
		dunesMagn       0.0431201
		dunesFreq       3235.28
		dunesFraction   0.186355
		hillsMagn       0.121177
		hillsFreq       334.458
		hillsFraction   0.950779
		hills2Fraction  0.213366
		riversMagn      59.7493
		riversFreq      3.41038
		riversSin       6.52771
		riversOctaves   0
		canyonsMagn     0.43371
		canyonsFreq     0.758969
		canyonFraction  0
		cracksMagn      0.0518528
		cracksFreq      0
		cracksOctaves   3
		craterMagn      0.555797
		craterFreq      10.40921
		craterDensity   0.870974
		craterOctaves   12
		craterRayedFactor 0
		volcanoMagn     0.486739
		volcanoFreq     1.13007
		volcanoDensity  0.0467461
		volcanoOctaves  0
		volcanoActivity 0
		volcanoFlows    0.14491
		volcanoRadius   0.725175
		volcanoTemp     1451.13
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0, 0, 0.128, 1.000)
		colorShelf     (0.138, 0.043, 0.226, 1.000)
		colorBeach     (0.030, 0.144, 0.237, 1.000)
		colorDesert    (0.100, 0.149, 0.237, 1.000)
		colorLowland   (0.138, 0.043, 0.226, 1.000)
		colorUpland    (0.138, 0.043, 0.226, 1.000)
		colorRock      (0.070, 0.130, 0.180, 1.000)
		colorSnow      (0.095, 0.158, 0.160, 1.000)
		colorLowPlants (0.070, 0.130, 0.180, 1.000)
		colorUpPlants  (0.656, 0.651, 0.646, 1.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.03
		SpecBrightIce   0.03
		SpecularPower   30
		Hapke           1
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.2
	}

	NoClouds        true

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          20
		Density         6.27413
		Pressure        0.01
		Greenhouse      25
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.017
		Saturation      0.762

		Composition
		{
			N2   	10
			CO2   	90		
		}
	}

	NoAurora        true

	NoRings         true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   4.1
		Period          8.3
		Eccentricity    0.0345106
		Inclination     0
		AscendingNode   0
		ArgOfPericenter 0
		MeanAnomaly     56.22809
	}
}
//* Parnitha System *//
Moon	"Kurinth"
{
	ParentBody     "Parnitha"
	Class	       "Desert"

	Mass            0.0798967
	Radius          3692.57
	InertiaMoment   0.335201

	Obliquity       1.36499
	EqAscendNode    119.791
	RotationPeriod	57.5

	AlbedoBond      0.255728
	AlbedoGeom      0.306874
	Brightness      2
	Color          (0.718 0.724 0.823)

	Surface
	{
		SurfStyle       0.143912
		OceanStyle      0.20459
		Randomize      (0.854, 0.971, -0.527)
		colorDistMagn   0.0458266
		colorDistFreq   625.529
		detailScale     12090.4
		colorConversion true
		seaLevel        0.159991
		snowLevel       2
		tropicLatitude  0.943839
		icecapLatitude  10
		icecapHeight    0.101876
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        1.26392
		venusFreq       1.1515
		venusMagn       0
		mareFreq        1.20195
		mareDensity     0.0487767
		terraceProb     0.278199
		erosion         0
		montesMagn      0.327511
		montesFreq      162.57
		montesSpiky     0.935255
		montesFraction  0.37602
		dunesMagn       0.0579149
		dunesFreq       33.2356
		dunesFraction   0.0926939
		hillsMagn       0.105289
		hillsFreq       518.27
		hillsFraction   0
		hills2Fraction  0
		riversMagn      55.0765
		riversFreq      2.74294
		riversSin       7.38241
		riversOctaves   0
		canyonsMagn     0.0390754
		canyonsFreq     115.441
		canyonFraction  0
		cracksMagn      0.086744
		cracksFreq      0.291356
		cracksOctaves   0
		craterMagn      0.656644
		craterFreq      13.6968
		craterDensity   0.742064
		craterOctaves   9.96438
		volcanoMagn     0.70959
		volcanoFreq     3.40823
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 2
		volcanoFlows    0.404361
		volcanoRadius   0.404936
		volcanoTemp     1540.34
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		colorSea       (0.138, 0.043, 0.226, 0.000)
		colorShelf     (0.0, 0.128, 0.0, 0.000)
		colorBeach     (0.138, 0.043, 0.226, 0.000)
		colorDesert    (0.085, 0.107, 0.047, 0.000)
		colorLowland   (0.075, 0, 0.130, 0.000)
		colorUpland    (0.0, 0.128, 0.0, 0.000)
		colorRock      (0.0, 0.128, 0.0, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.138, 0.043, 0.226, 0.000)
		colorUpPlants  (0.390, 0.360, 0.330, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0.958304
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          12.6809
		BumpHeight      6.24225
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        1.0766
		mainOctaves     10
		Coverage        0.111457
		twistZones      2.54108
		twistMagn       0.302893
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Chlorine"
		Height          65
		Density         0.00416956
		Pressure        65
		Greenhouse      624
		Bright          5.29686
		Opacity         1
		SkyLight        1.76562
		Hue             0.215
		Saturation      1

		Composition
		{
			H2   	75
			CH4   	25
		}
	}

	Aurora
	{
		Height      67.5797
		NorthLat    56.3555
		NorthLon    161.198
		NorthRadius 851.515
		NorthWidth  820.939
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -83.3137
		SouthLon    344.506
		SouthRadius 981.892
		SouthWidth  1006.59
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
		SemiMajorAxis   0.45
		Period          0.30
		Eccentricity    0.0065355
	}
}

Planet	"Thessia"
{
	ParentBody     "Parnitha"
	Class	       "Terra"

	Mass            0.947
	Radius          5940
	InertiaMoment   0.330899

	RotationPeriod  27.6
	Obliquity       4.119
	EqAscendNode    4.0362

	AlbedoBond      0.292955
	AlbedoGeom      0.351546
	Brightness      2
	Color          (0.731 0.702 0.703)

	Life
	{
		Class   "Organic"
		Type    "Multicellular"
		Biome   "Marine/Terrestrial"
		Panspermia "true"
	}

	Surface
	{
		SurfStyle       0.432712
		OceanStyle      0.30437
		Randomize      (0.231, 0.534, 0.134)
		colorDistMagn   0.0445366
		colorDistFreq   922.594
		detailScale     16023
		colorConversion true
		seaLevel        0.360143
		snowLevel       0.80801
		tropicLatitude  0.868113
		icecapLatitude  10
		icecapHeight    0.135215
		climatePole     0.5625
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.642249
		venusFreq       1.26335
		venusMagn       0
		mareFreq        5.51343
		mareDensity     0.0617993
		terraceProb     0.125356
		erosion         0.102014
		montesMagn      0.191889
		montesFreq      383.181
		montesSpiky     0.911106
		montesFraction  0.408171
		dunesMagn       0.0511002
		dunesFreq       60.4288
		dunesFraction   0.275565
		hillsMagn       0.144022
		hillsFreq       200.051
		hillsFraction   0.485892
		hills2Fraction  0.913308
		riversMagn      59.4915
		riversFreq      3.91367
		riversSin       7.32659
		riversOctaves   2
		canyonsMagn     0.0662634
		canyonsFreq     155.128
		canyonFraction  0.642908
		cracksMagn      0.123679
		cracksFreq      0.616807
		cracksOctaves   0
		craterMagn      0.615622
		craterFreq      20.1547
		craterDensity   0
		craterOctaves   0
		GlowMode       "Night"
		GlowColor      (0.7 0.7 0.15)
		GlowBright      2.42
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1.84994
		twistMagn       0.303473
		cycloneMagn     2.13917
		cycloneFreq     0.221009
		cycloneDensity  0.00788382
		colorSea       (0.075, 0, 0.130, 1.000)
		colorShelf     (0.150, 0.480, 0.460, 1.000)
		colorBeach     (0.400, 0.330, 0.280, 0.000)
		colorDesert    (0.260, 0.240, 0.220, 0.000)
		colorLowland   (0.500, 0.420, 0.350, 0.000)
		colorUpland    (0.240, 0.210, 0.210, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 1.308)
		colorLowPlants (0.046, 0.139, 0.087, 0.000)
		colorUpPlants  (0.034, 0.139, 0.034, 0.000)
		BumpHeight      20.3056
		BumpOffset      6.95279
		DiffMapAlpha   "Water"
		SpecBrightWater 0.65
		SpecBrightIce   0.85
		SpecularPower   55
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		DiffMap      "Mass-Effect/Thessia-Clouds.*"
		DayAmbient    3.0
		Height        15
	}

	Ocean
	{
		Height          10.95279
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
	}

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          45.7463
		Density         25.0381
		Pressure        0.96
		Greenhouse      38
		Bright          7
		Opacity         1
		SkyLight        3.33333
		Hue             -0.035
		Saturation      1.2

		Composition
		{
			N2   	70
			O2    	20
			C02   	15
			H20    	5
		}
	}

	Aurora
	{
		Height      44.0021
		NorthLat    71.4003
		NorthLon    -165.606
		NorthRadius 2158.31
		NorthWidth  2623.57
		NorthRings  4
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -52.0518
		SouthLon    6.98906
		SouthRadius 1414.01
		SouthWidth  1077.49
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
		SemiMajorAxis   0.94
		Period          0.9
		Eccentricity    0
		Inclination     0
		AscendingNode   49.1704
		ArgOfPericenter 117.849
		MeanAnomaly     272.29
	}
}

Planet	"Piares"
{
	ParentBody     "Parnitha"
	Class	       "Desert"

	Mass            0.786
	Radius          5984
	InertiaMoment   0.339173

	Oblateness      0.00412395

	RotationPeriod  35.5
	Obliquity       15.8326
	EqAscendNode    10.7304

	AlbedoBond      0.365606
	AlbedoGeom      0.438727
	Brightness      2
	Color          (0.814 0.771 0.796)

	Surface
	{
		SurfStyle       0.985961
		OceanStyle      0.783402
		Randomize      (0.480, 0.448, -0.706)
		colorDistMagn   0.0836784
		colorDistFreq   359.836
		detailScale     6896.02
		colorConversion true
		seaLevel        0.144655
		snowLevel       0.85
		tropicLatitude  0.186848
		icecapLatitude  10
		icecapHeight    0.12086
		climatePole     0.732123
		climateTropic   0.5625
		climateEquator  0.6875
		heightTempGrad  0.375
		tropicWidth     0.5
		mainFreq        0.757803
		venusFreq       0.870684
		venusMagn       0.365042
		mareFreq        1.75029
		mareDensity     0.0302215
		terraceProb     0.331418
		erosion         0
		montesMagn      0.13384
		montesFreq      102.556
		montesSpiky     0.989024
		montesFraction  0.88421
		dunesMagn       0.0517381
		dunesFreq       25.5581
		dunesFraction   0.361149
		hillsMagn       0.142297
		hillsFreq       242.672
		hillsFraction   0
		hills2Fraction  0
		riversMagn      60.5427
		riversFreq      3.50592
		riversSin       5.06316
		riversOctaves   0
		canyonsMagn     0.0348938
		canyonsFreq     74.1005
		canyonFraction  0
		cracksMagn      0.106963
		cracksFreq      0.2207
		cracksOctaves   0
		craterMagn      0.645766
		craterFreq      5.95403
		craterDensity   0
		craterOctaves   0
		volcanoMagn     0.631129
		volcanoFreq     3.4738
		volcanoDensity  0.4
		volcanoOctaves  1
		volcanoActivity 1.99323
		volcanoFlows    0.534517
		volcanoRadius   0.469527
		volcanoTemp     1564.03
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      1.4354
		twistMagn       0
		cycloneMagn     3.36925
		cycloneFreq     0.331919
		cycloneDensity  0.0105068
		colorSea       (0.640, 0.500, 0.420, 0.000)
		colorShelf     (0.680, 0.500, 0.470, 0.000)
		colorBeach     (0.218, 0.165, 0.032, 0.000)
		colorDesert    (0.410, 0.280, 0.180, 0.000)
		colorLowland   (0.310, 0.230, 0.170, 0.000)
		colorUpland    (0.510, 0.330, 0.190, 0.000)
		colorRock      (0.220, 0.210, 0.210, 0.000)
		colorSnow      (1.000, 1.000, 1.000, 0.769)
		colorLowPlants (0.240, 0.230, 0.140, 0.000)
		colorUpPlants  (0.189, 0.183, 0.107, 0.000)
		BumpHeight      20
		DiffMapAlpha   "Ice"
		SpecBrightWater 0.5
		SpecBrightIce   0.5
		SpecularPower   30
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      0.07
	}

	Clouds
	{
		Height          12.5115
		BumpHeight      6.41964
		Hapke           0.2
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      2
		mainFreq        0.947163
		mainOctaves     10
		Coverage        0.031211
		twistZones      1.4354
		twistMagn       0
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Mars"
		Height          76.64
		Density         14.1218
		Pressure        5.94069
		Greenhouse      148
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0
		Saturation      0.759669

		Composition
		{
			CO2   	65
			C2H6   	35
		}
	}

	Aurora
	{
		Height      40.8167
		NorthLat    82.1433
		NorthLon    72.2508
		NorthRadius 740.604
		NorthWidth  816.178
		NorthRings  3
		NorthBright 0.3
		NorthParticles 50000
		SouthLat    -76.0468
		SouthLon    216.62
		SouthRadius 857.113
		SouthWidth  781.238
		SouthRings  2
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
		SemiMajorAxis   1.75
		Period          1.3
		Eccentricity    0
		Inclination     0
		AscendingNode   49.1704
		ArgOfPericenter 117.849
		MeanAnomaly     272.29
	}
}

Planet	"Janiri"
{
	ParentBody     "Parnitha"
	Class	       "GasGiant"

	Mass            180.524
	Radius          54704
	InertiaMoment   0.254894

	Oblateness      0.0782739

	RotationPeriod  8.8
	Obliquity       5.19289
	EqAscendNode    118.079

	AlbedoBond      0.493494
	AlbedoGeom      0.592193
	Brightness      2
	Color          (0.593 0.564 0.495)

	Surface
	{
		SurfStyle       0.324555
		Randomize      (-0.685, -0.870, -0.740)
		detailScale     190707
		colorConversion true
		tropicLatitude  0.0827269
		icecapLatitude  0.982727
		mainFreq        0.00572202
		venusFreq       8.10052
		venusMagn       0.431836
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      8.76854
		twistMagn       0.643029
		cycloneMagn     13.2255
		cycloneFreq     0.399533
		cycloneDensity  0.0919651
		cycloneOctaves  1
		colorLayer0    (0.128, 0, 0, 1.000)
		colorLayer1    (0.220, 0.020, 0.060, 0.400)
		colorLayer2    (0.205, 0.092, 0.092, 0.000)
		colorLayer3    (0.255, 0.069, 0, 0.000)
		colorLayer4    (0.139, 0.069, 0.019, 0.000)
		colorLayer5    (0.210, 0.105, 0.030, 0.000)
		colorLayer6    (0.560, 0.460, 0.340, 0.000)
		colorLayer7    (0.560, 0.460, 0.340, 1.000)
		colorLowPlants (0.640, 0.520, 0.350, 0.000)
		colorUpPlants  (0.490, 0.400, 0.310, 0.000)
		BumpHeight      11.9031
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          82.6797
		BumpHeight      55.0245
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.806505
		mainOctaves     10
		Coverage        0.434944
		twistZones      8.76854
		twistMagn       0.643029
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Jupiter"
		Height          278.3
		Density         5393.04
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.365
		Saturation      1.381

		Composition
		{
			H2    	85
			He    	15
		}
	}

	Aurora
	{
		Height      4890.58
		NorthLat    82.1426
		NorthLon    130.035
		NorthRadius 20915.8
		NorthWidth  10919.8
		NorthRings  2
		NorthBright 1
		NorthParticles 10000
		SouthLat    -82.3629
		SouthLon    312.17
		SouthRadius 19224.8
		SouthWidth  8341.79
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
		SemiMajorAxis   6.6
		Period          17
		Eccentricity    0
		Inclination     0
		AscendingNode   49.1704
		ArgOfPericenter 117.849
		MeanAnomaly     272.29
	}
}

Planet	"Athame"
{
	ParentBody     "Parnitha"
	Class	       "GasGiant"

	Mass            145.678
	Radius          64549.2
	InertiaMoment   0.203304

	Oblateness      0.0022976

	RotationPeriod  18.7
	Obliquity       12.1384
	EqAscendNode    10.5493

	AlbedoBond      0.456677
	AlbedoGeom      0.548012
	Brightness      2
	Color          (0.603 0.512 0.717)

	Surface
	{
		SurfStyle       0.274195
		Randomize      (0.354, 0.656, 0.867)
		detailScale     167714
		colorConversion true
		tropicLatitude  0.211683
		icecapLatitude  1
		mainFreq        0.0244682
		venusFreq       7.62972
		venusMagn       0.316408
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      6.22307
		twistMagn       0.680323
		cycloneMagn     8.74094
		cycloneFreq     0.408771
		cycloneDensity  0.109891
		cycloneOctaves  1
		colorLayer0    (0.120, 0.200, 0.480, 1.100)
		colorLayer1    (0.330, 0.400, 0.720, 0.600)
		colorLayer2    (0.330, 0.400, 0.720, 0.200)
		colorLayer3    (0.600, 0.600, 0.600, 0.000)
		colorLayer4    (0.240, 0.128, 0.128, 0.000)
		colorLayer5    (0.165, 0.042, 0.042, 0.000)
		colorLayer6    (0.600, 0.650, 0.910, 0.000)
		colorLayer7    (0.990, 0.990, 1.000, 1.000)
		colorLowPlants (0.350, 0.430, 0.770, 0.000)
		colorUpPlants  (0.470, 0.540, 0.850, 0.000)
		BumpHeight      16.9406
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          143.965
		BumpHeight      57.7936
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.678403
		mainOctaves     10
		Coverage        0.0667672
		twistZones      6.22307
		twistMagn       0.680323
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Earth"
		Height          578.062
		Density         5381.03
		Pressure        1e+006
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             0.357
		Saturation      0.8

		Composition
		{
			H2    	93.0416
			He    	6.56385
		}
	}

	Aurora
	{
		Height      3866.97
		NorthLat    84.9795
		NorthLon    -39.4886
		NorthRadius 16798.6
		NorthWidth  9900.05
		NorthRings  3
		NorthBright 1
		NorthParticles 10000
		SouthLat    -84.3783
		SouthLon    151.05
		SouthRadius 19866.3
		SouthWidth  10584.5
		SouthRings  2
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	Rings
	{
		InnerRadius     100000.21
		OuterRadius     200000.88
		RotationPeriod  5.110211
		RotationOffset  206.0949
		FrontBright     1
		BackBright      1
		Density         1
		Exposure        1
	}

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   13.3
		Period          48.6
		Eccentricity    0.0214638
		Inclination     0.617517
		AscendingNode   -96.2687
		ArgOfPericenter 232.509
		MeanAnomaly     326.86
	}
}

Planet	"Tevura"
{
	ParentBody     "Parnitha"
	Class	       "IceGiant"

	Mass            28.6642
	Radius          26655
	InertiaMoment   0.21787

	Oblateness      0.001603

	RotationPeriod  15.5
	Obliquity       10.8325
	EqAscendNode    10.046

	AlbedoBond      0.510514
	AlbedoGeom      0.612617
	Brightness      2
	Color          (0.492 0.672 0.787)

	Surface
	{
		SurfStyle       0.826416
		Randomize      (-0.587, -0.518, -0.315)
		detailScale     62112.3
		colorConversion true
		tropicLatitude  0.463122
		icecapLatitude  1
		mainFreq        0.0291709
		venusFreq       9.40095
		venusMagn       0.481268
		craterOctaves   0
		volcanoActivity 0
		lavaCoverTidal  0
		lavaCoverSun    0
		lavaCoverYoung  0
		twistZones      3.79995
		twistMagn       0.921514
		cycloneMagn     10.4901
		cycloneFreq     0.239332
		cycloneDensity  0.152951
		cycloneOctaves  2
		colorLayer0    (0.190, 0.430, 0.850, 1.000)
		colorLayer1    (0.170, 0.450, 0.800, 1.000)
		colorLayer2    (0.180, 0.450, 0.830, 1.000)
		colorLayer3    (0.160, 0.460, 0.890, 1.000)
		colorLayer4    (0.180, 0.480, 0.860, 1.000)
		colorLayer5    (0.100, 0.450, 0.830, 1.000)
		colorLayer6    (0.190, 0.440, 0.860, 1.000)
		colorLayer7    (0.180, 0.430, 0.850, 1.000)
		colorLowPlants (0.180, 0.480, 0.860, 1.000)
		colorUpPlants  (0.100, 0.450, 0.830, 1.000)
		BumpHeight      14.1437
		SpecularPower   -1e+038
		Hapke           0
		SpotBright      4
		SpotWidth       0.05
		DayAmbient      1
	}

	Clouds
	{
		Height          105.082
		BumpHeight      64.8144
		Hapke           0
		SpotBright      2
		SpotWidth       0.15
		DayAmbient      1
		mainFreq        0.940159
		mainOctaves     10
		Coverage        0.552569
		twistZones      3.79995
		twistMagn       0.921514
	}

	NoOcean         true

	NoLava          true

	Atmosphere
	{
		Model          "Neptune"
		Height          241.489
		Density         3982.79
		Pressure        693610
		Bright          10
		Opacity         1
		SkyLight        3.33333
		Hue             -0.0152429
		Saturation      0.934399

		Composition
		{
			H2    	80
			CH4    	20
		}
	}

	Aurora
	{
		Height      263.534
		NorthLat    65.1165
		NorthLon    111.444
		NorthRadius 5944.91
		NorthWidth  6132.01
		NorthRings  4
		NorthBright 1
		NorthParticles 10000
		SouthLat    -67.4293
		SouthLon    294.135
		SouthRadius 4775.1
		SouthWidth  5826.67
		SouthRings  3
		SouthBright 1
		SouthParticles 10000
		TopColor    (1.000 1.000 1.000)
		BottomColor (1.000 0.000 0.500)
	}

	NoRings 		true

	NoAccretionDisk true

	NoCometTail     true

	Orbit
	{
		RefPlane        "Equator"
		SemiMajorAxis   24.4
		Period          120.9
		Eccentricity    0.0214638
		Inclination     0.617517
		AscendingNode   -96.2687
		ArgOfPericenter 232.509
		MeanAnomaly     326.86
	}
}
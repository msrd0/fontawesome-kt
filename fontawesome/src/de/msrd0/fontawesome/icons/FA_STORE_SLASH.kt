/* @generated
 *
 * This file is part of the FontAwesome Kotlin library.
 * https://github.com/msrd0/fontawesome-kt
 *
 * This library is not affiliated with FontAwesome. 
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.msrd0.fontawesome.icons

import de.msrd0.fontawesome.Icon
import de.msrd0.fontawesome.Style
import de.msrd0.fontawesome.Style.SOLID

object FA_STORE_SLASH: Icon {
	
	override val name get() = "Store Slash"
	
	override val unicode get() = "e071"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M94.92 49.09L117.7 13.13C122.8 4.98 131.9 .0007 141.6 .0007H498.4C508.1 .0007 517.2 4.979 522.3 13.13L579.6 103.8C609.3 150.7 583 215.8 527.5 223.2C523.6 223.7 519.6 224 515.4 224C489.4 224 466.2 212.6 450.3 195C434.4 212.6 411.2 224 385.1 224C359 224 335.8 212.6 319.9 195C314.4 201.1 308.1 206.4 301.2 210.7L480 350.9V250.7C491.2 254.1 503.1 256 515.4 256C521 256 526.4 255.6 531.7 254.9L531.7 254.9C535.1 254.4 540 253.6 544 252.6V401.1L630.8 469.1C641.2 477.3 643.1 492.4 634.9 502.8C626.7 513.2 611.6 515.1 601.2 506.9L9.196 42.89C-1.236 34.71-3.065 19.63 5.112 9.196C13.29-1.236 28.37-3.065 38.81 5.112L94.92 49.09zM112.2 223.2C68.36 217.3 42.82 175.1 48.9 134.5L155.3 218.4C145.7 222 135.3 224 124.4 224C120.3 224 116.2 223.7 112.2 223.2V223.2zM160 384H365.5L514.9 501.7C504.8 508.2 492.9 512 480 512H160C124.7 512 96 483.3 96 448V252.6C99.87 253.6 103.9 254.4 107.1 254.9L108.1 254.9C113.3 255.6 118.8 256 124.4 256C136.8 256 148.8 254.1 160 250.6V384z"/></svg>"""
		else -> null
	}
	
}

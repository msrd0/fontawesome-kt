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
import de.msrd0.fontawesome.Style.REGULAR

object FA_BELL_SLASH: Icon {
	
	override val name get() = "Bell Slash"
	
	override val unicode get() = "f1f6"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M186 120.5C209 85.38 245.4 59.84 288 51.2V32C288 14.33 302.3 .0003 320 .0003C337.7 .0003 352 14.33 352 32V51.2C425 66.03 480 130.6 480 208V226.8C480 273.9 497.3 319.2 528.5 354.4L535.9 362.7C544.3 372.2 546.4 385.6 541.2 397.1C540.1 397.5 540.8 397.1 540.6 398.4L630.8 469.1C641.2 477.3 643.1 492.4 634.9 502.8C626.7 513.2 611.6 515.1 601.2 506.9L9.196 42.89C-1.236 34.71-3.065 19.63 5.112 9.196C13.29-1.236 28.37-3.065 38.81 5.112L186 120.5zM160 226.8V222.1L406.2 416H128C115.4 416 103.1 408.6 98.81 397.1C93.65 385.6 95.71 372.2 104.1 362.7L111.5 354.4C142.7 319.2 160 273.9 160 226.8V226.8zM320 512C303 512 286.7 505.3 274.7 493.3C262.7 481.3 256 464.1 256 448H384C384 464.1 377.3 481.3 365.3 493.3C353.3 505.3 336.1 512 320 512z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M183.6 118.6C206.5 82.58 244.1 56.84 288 49.88V32C288 14.33 302.3 .0003 320 .0003C337.7 .0003 352 14.33 352 32V49.88C424.5 61.39 480 124.2 480 200V233.4C480 278.8 495.5 322.9 523.8 358.4L538.7 377C543.1 383.5 545.4 392.2 542.6 400L630.8 469.1C641.2 477.3 643.1 492.4 634.9 502.8C626.7 513.2 611.6 515.1 601.2 506.9L9.196 42.89C-1.236 34.71-3.065 19.63 5.112 9.196C13.29-1.236 28.37-3.065 38.81 5.112L183.6 118.6zM221.7 148.4L450.7 327.1C438.4 298.2 432 266.1 432 233.4V200C432 142.6 385.4 96 328 96H312C273.3 96 239.6 117.1 221.7 148.4V148.4zM160 233.4V222.1L206.7 258.9C202.7 297.7 189.5 335.2 168.3 368H345.2L406.2 416H120C110.8 416 102.4 410.7 98.37 402.4C94.37 394.1 95.5 384.2 101.3 377L116.2 358.4C144.5 322.9 160 278.8 160 233.4V233.4zM384 448C384 464.1 377.3 481.3 365.3 493.3C353.3 505.3 336.1 512 320 512C303 512 286.7 505.3 274.7 493.3C262.7 481.3 256 464.1 256 448H384z"/></svg>"""
		else -> null
	}
	
}

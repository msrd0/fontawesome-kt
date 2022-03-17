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

/** Dice D6 */
object FA_DICE_D6: Icon {
	
	override val name get() = "Dice D6"
	
	override val unicode get() = "f6d1"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M7.994 153.5c1.326 0 2.687 .3508 3.975 1.119L208 271.5v223.8c0 9.741-7.656 16.71-16.01 16.71c-2.688 0-5.449-.7212-8.05-2.303l-152.2-92.47C12.13 405.3 0 383.3 0 359.5v-197.7C0 156.1 3.817 153.5 7.994 153.5zM426.2 117.2c0 2.825-1.352 5.647-4.051 7.248L224 242.6L25.88 124.4C23.19 122.8 21.85 119.1 21.85 117.2c0-2.8 1.32-5.603 3.965-7.221l165.1-100.9C201.7 3.023 212.9 0 224 0s22.27 3.023 32.22 9.07l165.1 100.9C424.8 111.6 426.2 114.4 426.2 117.2zM440 153.5C444.2 153.5 448 156.1 448 161.8v197.7c0 23.75-12.12 45.75-31.78 57.69l-152.2 92.5C261.5 511.3 258.7 512 256 512C247.7 512 240 505 240 495.3V271.5l196-116.9C437.3 153.8 438.7 153.5 440 153.5z"/></svg>"""
		else -> null
	}
	
}

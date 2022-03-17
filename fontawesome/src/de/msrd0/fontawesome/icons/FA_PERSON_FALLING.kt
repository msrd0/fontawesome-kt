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

object FA_PERSON_FALLING: Icon {
	
	override val name get() = "Person Falling"
	
	override val unicode get() = "e546"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 448 512"><path d="M256 0C273.7 0 288 14.33 288 32V41.84C288 96.45 260.1 146.5 215.5 175.4L215.7 175.8L272.5 255.1H360C375.1 255.1 389.3 263.1 398.4 275.2L441.6 332.8C452.2 346.9 449.3 366.1 435.2 377.6C421.1 388.2 401 385.3 390.4 371.2L352 319.1H254.6L346.9 462.6C356.5 477.5 352.2 497.3 337.4 506.9C322.5 516.5 302.7 512.2 293.1 497.4L132.5 249.2C129.6 258.4 127.1 268.1 127.1 278.2V351.1C127.1 369.7 113.7 383.1 95.1 383.1C78.33 383.1 63.1 369.7 63.1 351.1V278.2C63.1 213 103.6 154.5 164.1 130.3C200.3 115.8 223.1 80.79 223.1 41.84V32C223.1 14.33 238.3 .0003 256 .0003L256 0zM32 80C32 53.49 53.49 32 80 32C106.5 32 128 53.49 128 80C128 106.5 106.5 128 80 128C53.49 128 32 106.5 32 80z"/></svg>"""
		else -> null
	}
	
}

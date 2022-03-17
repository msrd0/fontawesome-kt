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

/** Crow */
object FA_CROW: Icon {
	
	override val name get() = "Crow"
	
	override val unicode get() = "f520"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M523.9 31.1H574C603.4 31.1 628.1 51.99 636.1 80.48L640 95.1L544 119.1V191.1C544 279.1 484.9 354.1 404.2 376.8L446.2 478.9C451.2 491.1 445.4 505.1 433.1 510.2C420.9 515.2 406.9 509.4 401.8 497.1L355.2 383.1C354.1 383.1 353.1 384 352 384H311.1L350.2 478.9C355.2 491.1 349.4 505.1 337.1 510.2C324.9 515.2 310.9 509.4 305.8 497.1L259.2 384H126.1L51.51 441.4C37.5 452.1 17.41 449.5 6.638 435.5C-4.138 421.5-1.517 401.4 12.49 390.6L368 117.2V88C368 39.4 407.4 0 456 0C483.3 0 507.7 12.46 523.9 32V31.1zM456 111.1C469.3 111.1 480 101.3 480 87.1C480 74.74 469.3 63.1 456 63.1C442.7 63.1 432 74.74 432 87.1C432 101.3 442.7 111.1 456 111.1z"/></svg>"""
		else -> null
	}
	
}

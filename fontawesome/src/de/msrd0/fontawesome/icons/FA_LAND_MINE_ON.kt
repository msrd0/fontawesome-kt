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

/** Land Mine-on */
object FA_LAND_MINE_ON: Icon {
	
	override val name get() = "Land Mine-on"
	
	override val unicode get() = "e51b"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 576 512"><path d="M312 168C312 181.3 301.3 192 288 192C274.7 192 264 181.3 264 168V24C264 10.75 274.7 0 288 0C301.3 0 312 10.75 312 24V168zM160 320C160 302.3 174.3 288 192 288H384C401.7 288 416 302.3 416 320V352H160V320zM82.74 410.5C90.87 394.3 107.5 384 125.7 384H450.3C468.5 384 485.1 394.3 493.3 410.5L520.8 465.7C531.5 486.1 516 512 492.2 512H83.78C59.99 512 44.52 486.1 55.16 465.7L82.74 410.5zM4.269 138.3C11.81 127.4 26.77 124.7 37.66 132.3L141.7 204.3C152.6 211.8 155.3 226.8 147.7 237.7C140.2 248.6 125.2 251.3 114.3 243.7L10.34 171.7C-.5568 164.2-3.275 149.2 4.269 138.3V138.3zM538.3 132.3C549.2 124.7 564.2 127.4 571.7 138.3C579.3 149.2 576.6 164.2 565.7 171.7L461.7 243.7C450.8 251.3 435.8 248.6 428.3 237.7C420.7 226.8 423.4 211.8 434.3 204.3L538.3 132.3z"/></svg>"""
		else -> null
	}
	
}

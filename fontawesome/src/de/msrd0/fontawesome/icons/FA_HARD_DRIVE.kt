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

/** Hard drive */
object FA_HARD_DRIVE: Icon {
	
	override val name get() = "Hard drive"
	
	override val unicode get() = "f0a0"
	
	override val styles get() = setOf(SOLID, REGULAR)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M464 288h-416C21.5 288 0 309.5 0 336v96C0 458.5 21.5 480 48 480h416c26.5 0 48-21.5 48-48v-96C512 309.5 490.5 288 464 288zM320 416c-17.62 0-32-14.38-32-32s14.38-32 32-32s32 14.38 32 32S337.6 416 320 416zM416 416c-17.62 0-32-14.38-32-32s14.38-32 32-32s32 14.38 32 32S433.6 416 416 416zM464 32h-416C21.5 32 0 53.5 0 80v192.4C13.41 262.3 29.92 256 48 256h416c18.08 0 34.59 6.254 48 16.41V80C512 53.5 490.5 32 464 32z"/></svg>"""
		REGULAR -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M304 344c-13.25 0-24 10.74-24 24c0 13.25 10.75 24 24 24c13.26 0 24-10.75 24-24C328 354.7 317.3 344 304 344zM448 32h-384c-35.35 0-64 28.65-64 64v320c0 35.35 28.65 64 64 64h384c35.35 0 64-28.65 64-64V96C512 60.65 483.3 32 448 32zM464 416c0 8.822-7.178 16-16 16H64c-8.822 0-16-7.178-16-16v-96c0-8.822 7.178-16 16-16h384C456.8 304 464 311.2 464 320V416zM464 258.3C458.9 256.9 453.6 256 448 256H64C58.44 256 53.14 256.9 48 258.3V96c0-8.822 7.178-16 16-16h384c8.822 0 16 7.178 16 16V258.3zM400 344c-13.25 0-24 10.74-24 24c0 13.25 10.75 24 24 24c13.26 0 24-10.75 24-24C424 354.7 413.3 344 400 344z"/></svg>"""
		else -> null
	}
	
}

/** Alias for [FA_HARD_DRIVE]. */
val FA_HDD = FA_HARD_DRIVE

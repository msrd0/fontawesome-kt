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

/** Umbrella Beach */
object FA_UMBRELLA_BEACH: Icon {
	
	override val name get() = "Umbrella Beach"
	
	override val unicode get() = "f5ca"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M115.4 136.8l102.1 37.35c35.13-81.62 86.25-144.4 139-173.7c-95.88-4.875-188.8 36.96-248.5 111.7C101.2 120.6 105.2 133.2 115.4 136.8zM247.6 185l238.5 86.87c35.75-121.4 18.62-231.6-42.63-253.9c-7.375-2.625-15.12-4.062-23.12-4.062C362.4 13.88 292.1 83.13 247.6 185zM521.5 60.51c6.25 16.25 10.75 34.62 13.13 55.25c5.75 49.87-1.376 108.1-18.88 166.9l102.6 37.37c10.13 3.75 21.25-3.375 21.5-14.12C642.3 210.1 598 118.4 521.5 60.51zM528 448h-207l65-178.5l-60.13-21.87l-72.88 200.4H48C21.49 448 0 469.5 0 496C0 504.8 7.163 512 16 512h544c8.837 0 16-7.163 16-15.1C576 469.5 554.5 448 528 448z"/></svg>"""
		else -> null
	}
	
}

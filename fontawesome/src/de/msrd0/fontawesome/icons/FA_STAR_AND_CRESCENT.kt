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

object FA_STAR_AND_CRESCENT: Icon {
	
	override val name get() = "Star and Crescent"
	
	override val unicode get() = "f699"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M340.5 466.4c-1.5 0-6.875 .5-9.25 .5c-116.3 0-210.8-94.63-210.8-210.9s94.5-210.9 210.8-210.9c2.375 0 7.75 .5 9.25 .5c7.125 0 13.25-5 14.75-12c1.375-7.25-2.625-14.5-9.5-17.12c-29.13-11-59.38-16.5-89.75-16.5c-141.1 0-256 114.9-256 256s114.9 256 256 256c30.25 0 60.25-5.5 89.38-16.38c5.875-2 10.25-7.625 10.25-14.25C355.6 473.4 349.3 466.4 340.5 466.4zM503.5 213.9l-76.38-11.12L392.9 133.5C391.1 129.9 387.5 128 384 128c-3.5 0-7.125 1.875-9 5.5l-34.13 69.25l-76.38 11.12c-8.125 1.125-11.38 11.25-5.5 17l55.25 53.88l-13 76c-1.125 6.5 3.1 11.75 9.75 11.75c1.5 0 3.125-.375 4.625-1.25l68.38-35.88l68.25 35.88c1.625 .875 3.125 1.25 4.75 1.25c5.75 0 10.88-5.25 9.75-11.75l-13-76l55.25-53.88C514.9 225.1 511.6 214.1 503.5 213.9z"/></svg>"""
		else -> null
	}
	
}

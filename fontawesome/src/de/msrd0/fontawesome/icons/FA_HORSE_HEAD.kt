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

object FA_HORSE_HEAD: Icon {
	
	override val name get() = "Horse Head"
	
	override val unicode get() = "f7ab"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M509.8 332.5l-69.9-164.3c-14.9-41.2-50.4-71-93-79.2 18-10.6 46.3-35.9 34.2-82.3-1.3-5-7.1-7.9-12-6.1L166.9 76.3C35.9 123.4 0 238.9 0 398.8V480c0 17.7 14.3 32 32 32h236.2c23.8 0 39.3-25 28.6-46.3L256 384v-.7c-45.6-3.5-84.6-30.7-104.3-69.6-1.6-3.1-.9-6.9 1.6-9.3l12.1-12.1c3.9-3.9 10.6-2.7 12.9 2.4 14.8 33.7 48.2 57.4 87.4 57.4 17.2 0 33-5.1 46.8-13.2l46 63.9c6 8.4 15.7 13.3 26 13.3h50.3c8.5 0 16.6-3.4 22.6-9.4l45.3-39.8c8.9-9.1 11.7-22.6 7.1-34.4zM328 224c-13.3 0-24-10.7-24-24s10.7-24 24-24 24 10.7 24 24-10.7 24-24 24z"/></svg>"""
		else -> null
	}
	
}

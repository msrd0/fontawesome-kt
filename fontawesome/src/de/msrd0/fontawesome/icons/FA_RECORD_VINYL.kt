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

/** Record Vinyl */
object FA_RECORD_VINYL: Icon {
	
	override val name get() = "Record Vinyl"
	
	override val unicode get() = "f8d9"
	
	override val styles get() = setOf(SOLID)
	
	override fun svg(style: Style) = when(style) {
		SOLID -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 512 512"><path d="M256 160C202.9 160 160 202.9 160 256s42.92 96 96 96c53.08 0 96-42.92 96-96S309.1 160 256 160zM256 288C238.3 288 224 273.7 224 256s14.33-32 32-32c17.67 0 32 14.33 32 32S273.7 288 256 288zM256 0c-141.4 0-256 114.6-256 256s114.6 256 256 256c141.4 0 256-114.6 256-256S397.4 0 256 0zM256 384c-70.75 0-128-57.25-128-128s57.25-128 128-128s128 57.25 128 128S326.8 384 256 384z"/></svg>"""
		else -> null
	}
	
}

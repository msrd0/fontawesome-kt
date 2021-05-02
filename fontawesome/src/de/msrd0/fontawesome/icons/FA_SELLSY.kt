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
import de.msrd0.fontawesome.Style.BRANDS

object FA_SELLSY: Icon {
	
	override val name get() = "Sellsy"
	
	override val unicode get() = "f213"
	
	override val styles get() = setOf(BRANDS)
	
	override fun svg(style: Style) = when(style) {
		BRANDS -> """<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 512"><path d="M539.71 237.308c3.064-12.257 4.29-24.821 4.29-37.384C544 107.382 468.618 32 376.076 32c-77.22 0-144.634 53.012-163.02 127.781-15.322-13.176-34.934-20.53-55.157-20.53-46.271 0-83.962 37.69-83.962 83.961 0 7.354.92 15.015 3.065 22.369-42.9 20.225-70.785 63.738-70.785 111.234C6.216 424.843 61.68 480 129.401 480h381.198c67.72 0 123.184-55.157 123.184-123.184.001-56.384-38.916-106.025-94.073-119.508zM199.88 401.554c0 8.274-7.048 15.321-15.321 15.321H153.61c-8.274 0-15.321-7.048-15.321-15.321V290.626c0-8.273 7.048-15.321 15.321-15.321h30.949c8.274 0 15.321 7.048 15.321 15.321v110.928zm89.477 0c0 8.274-7.048 15.321-15.322 15.321h-30.949c-8.274 0-15.321-7.048-15.321-15.321V270.096c0-8.274 7.048-15.321 15.321-15.321h30.949c8.274 0 15.322 7.048 15.322 15.321v131.458zm89.477 0c0 8.274-7.047 15.321-15.321 15.321h-30.949c-8.274 0-15.322-7.048-15.322-15.321V238.84c0-8.274 7.048-15.321 15.322-15.321h30.949c8.274 0 15.321 7.048 15.321 15.321v162.714zm87.027 0c0 8.274-7.048 15.321-15.322 15.321h-28.497c-8.274 0-15.321-7.048-15.321-15.321V176.941c0-8.579 7.047-15.628 15.321-15.628h28.497c8.274 0 15.322 7.048 15.322 15.628v224.613z"/></svg>"""
		else -> null
	}
	
}
